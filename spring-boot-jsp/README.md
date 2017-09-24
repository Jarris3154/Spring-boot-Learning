# spring-boot-jsp

### 在springboot中配置使用jsp

1. 首先在POM中引入相关依赖(embed tomcat 中不能有provided的scope)；
2. 接着在application.properties中声明jsp的位置前缀和后缀；
3. 写好Controller；
4. 需要使用spring-boot-plugin的spring-boot:run命令来启动，否则报404找不到jsp。