# springcloud-feign

#笔记
   [参考博客](https://blog.csdn.net/qq_21082615/article/details/91864179)
#项目主要步骤
    1.搭建服务注册中心eureka(springcloud-feign-eureka)
    引入依赖eureka-server
    创建启动类,使用@EnableEurekaServer注解声明这是服务注册中心
    配置application.yml
        server.port
        eureka.instance.hostname
        eureka.client.service-url.defaultZone
        eureka.client.register-with-eureka
        eureka.client.fetch-registry
    启动测试，访问 ok
    2.服务提供者(springcloud-feign-user-service)
    创建子module springcloud-feign-user-provider,springcloud-feign-user-api
        服务实现(springcloud-feign-user-provider)
            引入依赖 eureka-client openfeign
            创建启动类,使用@EnableEurekaClient向服务中心注册服务 使用@EnableFeignClients启用feign客户端
            配置application.yml 
                server.port
                spring.application.name
                eureka.client.service-url.defaultZone
        feign客户端(springcloud-feign-user-api)
            引入依赖openfeign
            创建feignclient接口 使用@FeignClient注解声明feign客户端方法参数记得使用@RequestBody@RequestParam注解
    启动 测试 服务提供ok
    3.创建项目请求入口(springcloud-feign-rest)
    引入依赖 openfeign eureka-client
    创建启动类，使用@EnableEurekaClient注解使用Eureka服务器
    创建controller，使用@AutoWired注解注入对象
    配置application.yml
        server.port
        eureka.client.service-url.defaultZone
        spring.application.yml
    启动顺序
        eureka provider rest