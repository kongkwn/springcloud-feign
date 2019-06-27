package com.tw.cloud.rest.springcloudfeignrest.controller;

import com.tw.cloud.user.api.springcloudfeignuserapi.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 17:50 2019/6/26
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserFeignClient feignClient;

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public String findUserInfo(@RequestParam("userName") String userName){
        String userInfo = feignClient.findUserInfo(userName);
        return userInfo;
    }
}
