# BRONSP
(BRONS Plus)

---
## quick start  

0. 导入bronsp源码到eclipse  

	``` sh
cd ~  
git clone ....  
cd ~/bronsp  
mvn eclipse:eclipse  
```

0. 编译bronsp源码  

	``` sh
cd ~/bronsp  
mvn clean install -Dmaven.test.skip  
```
---
## 准备运行环境  

1. 安装 zookeeper  

2. 安装 redis  

3. 安装 mysql  

4. 

---
## 运行bronsp  

1. 启动bronsp server  
	
	//TODO  

2. 启动bronsp client  

	//TODO  

3. 启动bronsp governor

	//TODO  

4. 执行检查功能
	
	//TODO 执行这些功能，证明bronsp环境已经ok

---
## 功能目录

//TODO bronsp 当前拥有的功能，按模块列出，并链接到对应的READEM.md  [用户权限](/bronsp-base-user/README-base-user.md)

---
## 开发规范

### 工程结构&扩展规范
	
	bronsp-common-XXX ： 公共能力工程
	
	bronsp-core-XXX ： 基础模型工程，一般包括模型和DAO程序
	
	bronsp-facade-XXX ： 接口工程
	
	bronsp-service-XXX： 服务提供者工程（也可消费其他模块提供的服务），要求service工程都可以独立运行
	
	bronsp-runtime-assembly： 存放运行环境所需资源的工程
	
	bronsp-web-XXX： web类型的工程

### package规范
	
	org.fone.bronsp.功能.限定.模块
	
	功能： 
	限定： 




	