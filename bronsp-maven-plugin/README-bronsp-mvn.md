
##	使用说明

*	执行以下步骤前先确保已经知晓如何使用本插件(见：使用插件)

*	（必须为maven工程）主工程目录下执行以下命令，自动生成服务端代码：

	mvn bronsp:gendao 

*	默认模型定义文件位于：主工程/model/ 目录；-Dmodel.file.path可指定模型定义文件存放路径，命令如下：
	
	mvn bronsp:gendao -Dmodel.file.path=/User/temp/
	
*	默认处理所有xml文件；也可通过-Dmodel.file指定只处理model-user.xml文件，命令如下：
	
	mvn bronsp:gendao -Dmodel.file.path=/User/temp/ -Dmodel.file=model-user
	
	注：无需指定后缀名
	
*	默认生成的源码package路径为 主工程/src/main/java/${project.groupId}，其中系统自动过滤并转换java保留字，包命名规范为： 公司/组织 . 产品 . 功能模块划分 . 功能类型限定 . 业务域；-Dmain.package可指定类的package，命令如下：

	mvn bronsp:gendao -Dmain.package=com.bosh.tis
	
	假如：如上生成User.java，则完整的类package为： com.bosh.tis.model.po.User

*	默认系统将使用插件中的自带的模版生成代码；-Dtemplates.path可指定模版位置，命令如下：
	
	mvn bronsp:gendao -Dtemplates.path=/User/gendao/templates/
	
*	默认会生成所有加载到的模型；可通过-Dfixed.models指定生成特定模版，命令如下：
	
	mvn bronsp:gendao -Dfixed.models=user,tb_gnl
	
	注： 指定多个模型对象（通过模型的id指定）时用逗号分隔；

*	默认为每个模型生成对应的ddl、model、dao、biz、controller、ui、service层源码；可通过-Dgen.type指定层类型，命令如下：
	
	mvn bronsp:gendao -Dgen.type=ddl,model,dao,biz
	
	注： 多种类型逗号分隔
	
*	待增强功能
	1、清理功能（完全清理，部分清理）
	2、设计并实现，dao、biz、controller层的可修改性（解决自动代码修改后，再次生成时，会被覆盖的问题！）
	3、生成对应的单元测试 gen.type 中增加 test 类型的源码生成能力。
	
	
##	模型定义文件规则说明
	
*	见 bronsp-maven-plugin/model/model-demo.xml,model-acct.xml


##	使用注意项

* 1、使用本命令的工程必须依赖 bronsp-base、bronsp-common 项目，因为生成的源码中包括了类 org.fone.bronsp.base.WhereCondation
	
	<dependency>
		<groupId>org.fone.bronsp</groupId>
		<artifactId>bronsp-base</artifactId>
	</dependency>
	
	<dependency>
		<groupId>org.fone.bronsp</groupId>
		<artifactId>bronsp-common</artifactId>
	</dependency>


##	使用插件：

	1、方式一：在pom.xml中通过plugins引入
		
		<build>
			<plugins>
		      <plugin>
		        <groupId>org.fone.bronsp</groupId>
		        <artifactId>bronsp-maven-plugin</artifactId>
		        <version>0.0.1</version>
		      </plugin>
			</plugins>
		</build>
	
	  使用
	  	mvn org.fone:bronsp-maven-plugin:0.0.1:"gendao"
	  	或
	  	mvn bronsp:"gendao"
	
	
	2、方式二(推荐使用)：在maven环境中设置 setting.xml ， ${user.home}/.m2/settings.xml
	
		<pluginGroups>
		  <pluginGroup>org.fone.bronsp</pluginGroup>
		</pluginGroups>
		
		注： 此处 pluginGroup 配置的是 插件工程的 groupId

	  之后，所有工程都可以用该插件了 —— 不必每个工程的pom.xml中增加pulgin配置

## 开发经验

*	关于单元测试

不要把单元测试所需的资源和java放在同一个package路径下，建议放去 src/test/resources/META-INF/ 目录下，
因为maven编译时，默认不会编译package目录下非java资源（资源不会到classes路径去，执行单元测试时，会找不到资源）
但是maven会编译放resources目录下的内容到 classes/META-INF 去； 见： Xml22BeanUtilTest.java 中 testParseToBean()

*	如何开发maven插件，参考官网：[扩展maven插件](http://maven.apache.org/guides/plugin/guide-java-plugin-development.html)



## 遗留问题

问题一、 (解决)如何把FreeMarker模版放在jar包中，使用着无需依赖外部目录？
	
	见：FreeMarkerUtil中两个init开头的方法；

问题二、 没有做模型的重复检查，如： 1.xml 2.xml两个模型文件中都定义了 acct，目前没有做报错提示；

问题三、 (解决)应该把生成源码的功能块重构为不同的生成策略，提升扩展性；
	
	见：ASourceCodeGenerator、IGenModelDefine、GenDAOManager

问题四： 没有生成VO、DTO

问题五： 还未生成ui层代码

问题六： 还未生成dubbo的service代码





