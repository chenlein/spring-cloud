# spring-cloud
spring cloud demo

----

## 启动顺序：
- 首先启动注册中心：service-discovery
- 然后启动配置重新：config-server，配置中心目前使用的本地classpath作为配置文件的存放位置
- 然后启动路由网关：router-filter，该服务的路由配置获取至配置中心
- 最后启动demo，该应用会注册到服务注册中心，通过配置中心的服务ID从注册中心获得配置中心的地址，然后访问配置中心获得配置

## 测试验证：
- http://localhost:8082/app/config，测试能否正常读取到配置中心的配置
- http://localhost:8082/app/hystrix，测试熔断器能否在服务异常是返回默认值
- http://localhost:8080，查看注册中心服务列表spring-cloud

