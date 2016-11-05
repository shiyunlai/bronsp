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
 * Controller.java源码生成器
 * 
 * @author megapro
 *
 */
public class ControllerGenerator extends ASourceCodeGenerator<BizModel> {

	/**
	 * <br/>生成模型的Controller类（Spring MVC实现，@Controller）
	 * <br/>每个模型独立一个controller类
	 * @param genModelDef 业务模型们
	 * @param resourcesDir 工程路径
	 * @param sourceDir 源码路径
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
			String pControllerJava    = CommonUtil.normPackageName(bm.getPackageName() + ".controller" + "." + bm.getId() ) ; 
			map.put("mainPackage", bm.getPackageName()) ;
			map.put("bizmodelId", CommonUtil.normPackageName(bm.getId())) ;//业务领域id
			for( Model m : bm.getModels() ){
				
				map.put("table", m) ; 
				String className = FreeMarkerUtil.capFirst(CommonUtil.line2Hump(m.getId())) ; 
				map.put("poClassName", className) ;//Controller对象类名
				
				//生成XXMapper.java
				map.put("packageName", pControllerJava) ; 
				targetFile = sourceDir + CommonUtil.package2Path(pControllerJava) + className + "Controller.java";
				try {
					FreeMarkerUtil.process("Controller.java.ftl", map, targetFile);
					addGenFile(targetFile);
				} catch (Exception e) {
					throw new GenDaoMojoException("生成XXXController.java源码失败!"+targetFile,e) ; 
				}
			}
		}		
	}

	@Override
	protected String getGeneratorDescription() {
		return "生成XXXController.java";
	}

}
