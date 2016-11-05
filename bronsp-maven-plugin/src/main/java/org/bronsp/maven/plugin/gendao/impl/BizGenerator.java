/**
 * 
 */
package org.bronsp.maven.plugin.gendao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bronsp.maven.plugin.exception.GenDaoMojoException;
import org.bronsp.maven.plugin.gendao.BizModel;
import org.bronsp.maven.plugin.gendao.Model;
import org.bronsp.maven.plugin.gendao.api.ASourceCodeGenerator;
import org.bronsp.maven.plugin.utils.CommonUtil;
import org.bronsp.maven.plugin.utils.FreeMarkerUtil;

/**
 * 
 * XXXBiz.java业务逻辑类生成器
 * 
 * @author megapro
 *
 */
public class BizGenerator extends ASourceCodeGenerator<BizModel>{

	/**
	 * 生成Biz业务逻辑类（Spring MVC实现，@Service）
	 * @param genModelDef
	 * @param resourcesDir
	 * @param sourceDir
	 * @throws GenDaoMojoException 
	 */
	@Override
	protected void doGen(List<BizModel> genModelDef, String resourcesDir,
			String sourceDir) throws GenDaoMojoException {
		Map map = new HashMap();
		String targetFile = null ; 
		for( BizModel bm : genModelDef ){
			map.clear(); 
			//源码package
			String pBizJava    = CommonUtil.normPackageName(bm.getPackageName() + ".biz" +"." + bm.getId()); 
			map.put("mainPackage", bm.getPackageName()) ;
			map.put("bizmodelId", CommonUtil.normPackageName(bm.getId())) ;//业务领域id
			for( Model m : bm.getModels() ){
				
				map.put("table", m) ; 
				String className = FreeMarkerUtil.capFirst(CommonUtil.line2Hump(m.getId())) ; 
				map.put("poClassNameVar", className) ;//模型PO对象类名
				
				//生成XXBiz.java
				map.put("packageName", pBizJava) ; 
				targetFile = sourceDir + CommonUtil.package2Path(pBizJava) + className + "Biz.java";
				try {
					FreeMarkerUtil.process("BizService.java.ftl", map, targetFile);
					addGenFile(targetFile);
				} catch (Exception e) {
					throw new GenDaoMojoException("生成XXXBiz源码失败!"+targetFile,e) ; 
				}
			}
		}
	}

	@Override
	protected String getGeneratorDescription() {
		return "生成XXXBiz.java";
	}

}
