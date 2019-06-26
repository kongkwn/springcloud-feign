package com.tw.cloud.springcloudfeigneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudFeignEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignEurekaApplication.class, args);
    }

}
