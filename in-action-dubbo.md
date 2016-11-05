Spring MVC 工程 bronsp-web-governor 作为接入端 环境OK
Spring MVC 工程 bronsp-web-governor 作为服务消费者  调用dubbo的Demo服务 OK
开发bronsp-service-org提供服务 环境OK
bronsp-service-org启动dubbo服务ok，在注册中心可以看见服务记录  OK

Spring MVC调用 bronsp-service-org的服务 失败，报错：
com.alibaba.dubbo.remoting.TimeoutException: Waiting server-side response timeout. start time: 2016-10-09 11:19:20.857, end time: 2016-10-09 11:19:23.859, client elapsed: 0 ms, server elapsed: 3002 ms, timeout: 3000 ms, request: Request [id=3, version=2.0.0, twoway=true, event=false, broken=false, data=RpcInvocation [methodName=insert, parameterTypes=[class org.bronsp.core.model.Btf_org_info], arguments=[org.bronsp.core.model.Btf_org_info@5345b546], attachments={path=org.bronsp.facade.org.IOrgInfoService, interface=org.bronsp.facade.org.IOrgInfoService, version=0.0.0, timeout=3000}]], channel: /116.229.203.6:61101 -> /116.229.203.6:20880

进一步测试，使用了dubbo自带的demo消费者demo-customer,调用bronsp-service-org中的服务，报错相同
demo-customer调用demo-provider的服务ok
bronsp-web-governor调用demo-provider服务ok

问题应该出在 bronsp-service-org 上

将bronsp-service-org的系列化方式换为fastjson，另外服务提供者，消费者都加上fastjson的jar依赖
dubbo服务调用成功

但是mybitas访问数据库出错：java.lang.IllegalArgumentException: Mapped Statements collection does not contain value

开始百度.... 没找到答案

参照原可用工程，调整＊Mapp.xml 的文件位置至 /src/main/resources/ 同package路径下

重新编译bronsp-service-org，启动，通过bronsp-web-governor

可以调到DAO，操作数据库，但是报错： 字段超长

调整Serviec的程序，主动控制code的长度，

调用成功！

至此：

    1、Spring MVC 接入请求，并作为服务消费者：        bronsp-web-governor
    2、将业务逻辑、DAO两层解耦成独立的dubbo服务实现：   brons-service-org
    3、开发1，2之前，先根据需求设计完成org的模型和接口： brons-facade-org

下一步：
	0、合理的配置文件拆分；
	有助于：开发、测试、投产 这三个过程中如何借助disconf进行配置管理；

	1、整理pom.xml 明确每一个依赖jar及其作用

		新增工程 bronsp-*-trans 用以完成本任务

		还要思考 配置文件如何规划 ？？？？

	2、搭建bronsp开发环境（zookeeper、dubbo admin、dubbo monitor、数据库）

	3、进行 brons governor正式迁移
