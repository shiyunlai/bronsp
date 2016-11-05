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
 * 生成模型的PO对象（Persistant Object）
 * <br/>所有模型均生成在当前工程路径下
 * @author megapro
 *
 */
public class POGenerator extends ASourceCodeGenerator<BizModel> {

	/**
	 * 生成模型的PO对象
	 * @param genModelDef 业务域模型们
	 * @param resourcesDir 资源路径
	 * @param sourceDir 源码存放路径
	 * @throws GenDaoMojoException
	 */
	@Override
	protected void doGen(List<BizModel> genModelDef,
			String resourcesDir, String sourceDir) throws GenDaoMojoException {
		
		Map map = new HashMap();
		
		for( BizModel bm : genModelDef ){
			
			map.clear(); 
			//源码package
			String p = CommonUtil.normPackageName(bm.getPackageName() + ".model.po" + "." + bm.getId()) ;
			map.put("packageName", p) ; 
			map.put("bizmodelId", CommonUtil.normPackageName(bm.getId())) ;//业务领域id
			String targetPath = sourceDir + CommonUtil.package2Path(p) ; 
			for( Model m : bm.getModels() ){
				map.put("table", m);
				map.put("defineFile", bm.getModelDefFile());
				//生成PO对象
				String poJavaFiel = targetPath + FreeMarkerUtil.capFirst(CommonUtil.line2Hump(m.getId())) + ".java" ; 
				try {
					FreeMarkerUtil.process("Model.java.ftl", map, poJavaFiel);
					addGenFile(poJavaFiel);
				} catch (Exception e) {
					e.printStackTrace();
					throw new GenDaoMojoException("生成PO源码时失败！模型:"+m.toString(),e) ; 
				}
			}
		}
	}

	@Override
	protected String getGeneratorDescription() {
		return "生成模型的PO对象";
	}

}
