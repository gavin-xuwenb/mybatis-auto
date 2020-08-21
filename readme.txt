1.pom.xml 里面加parent，代表是一个springboot项目，
  后续的引入依赖大部分不需要提供版本号,根据parent，maven自动管理下载
  
 <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.3.1.RELEASE</version>
  </parent>

    同时需要加入maven-plugin，不然添加parent，pom.xml会报错
    <!-- 编译 -->
    <build>
        <!-- 插件 -->
        <plugins>
            <!-- maven插件  -->
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        <plugins>
     <build>

2.pom.xml   plugin 里面mysql 需要指定版本号
  pom.xml   mybatis-generator-maven-plugin 版本号1.4.0不支持 （换了好几个版本号）
  
3.mysql 8.0 的 驱动类 driverClass = "com.mysql.cj.jdbc.Driver"  ,不同于早期版本 "com.mysql.jdbc.Driver"
  connectionURL="jdbc:mysql://192.168.61.194/webag_for_wenbin?serverTimezone=GMT" ,没有加时区可能报错
4.工程下 cmd   执行命令 ：mvn mybatis-generator:generate

****************************************


