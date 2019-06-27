package com.tw.cloud.user.api.springcloudfeignuserapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 17:28 2019/6/26
 */
@FeignClient(name = "springcloud-feign-user-provider",url = "http://localhoost:8082")
public interface UserFeignClient {
    @RequestMapping(value = "user/getUser",method = RequestMethod.GET)
    String findUserInfo(@RequestParam("userName") String userName);
}
