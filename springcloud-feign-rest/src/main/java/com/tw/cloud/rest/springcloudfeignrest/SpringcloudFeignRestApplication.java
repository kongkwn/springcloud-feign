package com.tw.cloud.rest.springcloudfeignrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.tw.cloud.user.api.springcloudfeignuserapi.feign"})
public class SpringcloudFeignRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignRestApplication.class, args);
    }

}
