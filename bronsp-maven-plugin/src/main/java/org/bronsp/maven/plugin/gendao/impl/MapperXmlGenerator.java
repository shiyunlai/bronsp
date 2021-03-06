/**
 * 
 */
package org.bronsp.maven.plugin.gendao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.bronsp.maven.plugin.exception.GenDaoMojoException;
import org.bronsp.maven.plugin.gendao.BizModel;
import org.bronsp.maven.plugin.gendao.Model;
import org.bronsp.maven.plugin.gendao.api.ASourceCodeGenerator;
import org.bronsp.maven.plugin.utils.CommonUtil;
import org.bronsp.maven.plugin.utils.FreeMarkerUtil;

/**
 * 
 * Mapper.xml源码生成器
 * 
 * @author megapro
 *
 */
public class MapperXmlGenerator extends ASourceCodeGenerator<BizModel> {
	
	/**
	 * <br/>生成Mapper.xml
	 * @param genModelDef 业务模型们
	 * @param resourcesDir *Mapper.xml存放路径
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
			map.put("defineFile", bm.getModelDefFile());
			
			//源码package
			String pMapperJava = CommonUtil.normPackageName(bm.getMainpackage() + ".dao.mapper"+"." +bm.getId()) ; 
			String pMapperXml  = pMapperJava ; 
			map.put("mainPackage", bm.getMainpackage()) ;
			map.put("bizmodelId", CommonUtil.normPackageName(bm.getId())) ;//业务领域id
			
			String realResourcesDir = null ; 
			if( StringUtils.isNotEmpty(bm.getPrjService()) ){
				//如果模型中定义了 prjService ，则将代码生成到指定工程目录下 
				realResourcesDir = CommonUtil.replacePrjNameInMaven(resourcesDir, bm.getPrjService()) ;
			}else{
				//模型中没有定义 prjSevice ，则代码生成到当前工程
				realResourcesDir = resourcesDir ;
			}
			
			for( Model m : bm.getModels() ){
				
				map.put("table", m) ; 
				String className = FreeMarkerUtil.capFirst(CommonUtil.line2Hump(m.getId())) ; 
				map.put("poClassNameVar", className) ;//模型PO对象类名
				
				//生成XXMapper.xml，存放到资源路径
				map.put("packageName", pMapperXml) ;
				targetFile = realResourcesDir + CommonUtil.package2Path(pMapperXml) + className + "Mapper.xml";
				try {
					FreeMarkerUtil.process("Mapper.xml.ftl", map, targetFile);
					addGenFile(targetFile);
				} catch (Exception e) {
					throw new GenDaoMojoException("生成XXXMapper.xml源码失败!"+targetFile,e) ; 
				}
			}
		}		
	}
	
	@Override
	protected String getGeneratorDescription() {
		return "生成XXXMapper.xml";
	}

}
