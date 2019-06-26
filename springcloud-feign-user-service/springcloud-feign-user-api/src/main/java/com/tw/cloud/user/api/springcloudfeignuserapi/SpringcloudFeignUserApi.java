package com.tw.cloud.user.api.springcloudfeignuserapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 18:30 2019/6/26
 */
@SpringBootApplication
@EnableFeignClients
public class SpringcloudFeignUserApi {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignUserApi.class, args);
    }
}
