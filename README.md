# SSM框架整合

## 整合思路

将工程的三层结构中的`JavaBean`分别使用`Spring容器`（**通过XML方式**）进行管理。

 

1. 整合持久层`mapper`，包括`数据源`、`SqlSessionFactory`及`mapper`代理对象的整合；
2. 整合业务层`Service`，包括`事务Bean`及`service`的`bean`的配置；
3. 整合表现层`Controller`，直接使用`springmvc`的配置。
4. `Web.xml`加载`spring`容器（包含多个XML文件，还分为`父子容器`）

 

**核心配置文件：**

- applicationContext-dao.xml
- applicationContext-service.xml
- springmvc.xml
- web.xml

 

## 工程搭建

**依赖包：**

- spring（包括springmvc）
- mybatis
- mybatis-spring整合包
- 数据库驱动
- 第三方连接池
- JSTL
- servlet-api

