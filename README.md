# LearnSpring
Spring入门学习
把Spring Guides 里的两个入门例子整合了一下。
[Serving Web Content with Spring MVC](http://spring.io/guides/gs/serving-web-content/)
[Accessing Data with JPA](http://spring.io/guides/gs/accessing-data-jpa/)
熟悉一下 Spring Boot 和 MVC 以及 JPA。顺带体验了 idea 和 Gradle 。


##运行
首先你要安装 Gradle ，至于怎么安装上文中提到是 Spring Guides里有说。
cd 到项目目录（build.gradle 文件所在目录）。

    gradle build
 
 build 过程中会下载工程所需的 Jar 包，耐心等待。已经加入了开源中国提供的国内 Maven 库， 会快一点点。
 build 好之后：

    gradle bootRun
 就可以启动服务了。
 
##效果
程序里定义了几个 Customer 对象，访问
[http://localhost:8080/customers](http://localhost:8080/customers)
可以查看所有对象：

    Find:

    Customer[id=1, firstName='Jack', lastName='Bauer']
	Customer[id=2, firstName='Chloe', lastName='O'Brian']
	Customer[id=3, firstName='Kim', lastName='Bauer']
	Customer[id=4, firstName='David', lastName='Palmer']
	Customer[id=5, firstName='Michelle', lastName='Dessler']

也可以稍微过滤下：
[http://localhost:8080/customers?name=Bauer](http://localhost:8080/customers?name=Bauer)

    Find:

	Customer[id=1, firstName='Jack', lastName='Bauer']
	Customer[id=3, firstName='Kim', lastName='Bauer']
