package org.bronsp.maven.plugin;

import org.bronsp.maven.plugin.freemarker.ext.HumpClassNameTest;
import org.bronsp.maven.plugin.utils.CommonUtilTest;
import org.bronsp.maven.plugin.utils.FreeMarkerUtilTest;
import org.bronsp.maven.plugin.utils.KeyWordUtilTest;
import org.bronsp.maven.plugin.utils.Xml22BeanUtilTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * bronsp-maven-plugin 工程的测试套件
 * @author megapro
 *
 */
@RunWith(Suite.class)
@SuiteClasses({
		HumpClassNameTest.class,
		CommonUtilTest.class,
		FreeMarkerUtilTest.class,
		KeyWordUtilTest.class,
		Xml22BeanUtilTest.class
	})
public class AllTests {

}
