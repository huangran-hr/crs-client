init project
gradle 项目

使用 gradle clean build 打jar包。

在需要使用的springboot项目中加入依赖：
gradle项目 dependencies加入implementation 'com.sjlh.hotel:crs-client:0.0.2'即可

maven项目加入
<dependency>
<groupId>com.sjlh.hotel</groupId>
<artifactId>crs-client</artifactId>
<version>0.0.2</version>
</dependency>
即可

在SpringBoot启动类中使用注解@EnableCrsOrderClient即可。
