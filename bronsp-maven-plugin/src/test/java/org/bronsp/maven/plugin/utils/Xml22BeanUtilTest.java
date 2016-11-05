package org.bronsp.maven.plugin.utils;

import junit.framework.Assert;

import org.bronsp.maven.plugin.utils.helper.Bean;
import org.junit.Test;

public class Xml22BeanUtilTest {

	@Test
	public void testParseToBean() {
		
		//String fd = Xml22BeanUtilTest.class.getResource("testXmlToBean.xml").getPath() ; //不建议的做法，测试资源testXmlToBean.xm域java放在package路径下
		String testXmlFile = this.getClass().getResource("/META-INF/testXmlToBean.xml").getPath() ; //建议放到 resources/META-INF目录
		Bean t = Xml22BeanUtil.parseToBean(Bean.class,testXmlFile);
		
		Assert.assertEquals("x.m", t.getName());
		Assert.assertEquals("xm1000x", t.getCode());
		Assert.assertEquals(2, t.getLevels().size());
		Assert.assertEquals("none", t.getLevels().get(0).getValue());
		Assert.assertEquals(3, t.getExtras().size());
		Assert.assertEquals("xx.mm.xxextra", t.getExtras().get(1).getContent());
		Assert.assertEquals("我是描述信息1", t.getDescription());
		
	}
	
	@Test
	public void testXml2Bean() {
		
		String testXmlFile = this.getClass().getResource("/META-INF/testXmlToBean.xml").getPath() ; 
		Bean t = Xml22BeanUtil.xml2Bean(Bean.class,testXmlFile);
		
		Assert.assertEquals("x.m", t.getName());
		Assert.assertEquals("xm1000x", t.getCode());
		Assert.assertEquals(2, t.getLevels().size());
		Assert.assertEquals("none", t.getLevels().get(0).getValue());
		Assert.assertEquals(3, t.getExtras().size());
		Assert.assertEquals("xx.mm.xx", t.getExtras().get(2).getContent());
		Assert.assertEquals("我是描述信息1", t.getDescription());
	}
	
}
