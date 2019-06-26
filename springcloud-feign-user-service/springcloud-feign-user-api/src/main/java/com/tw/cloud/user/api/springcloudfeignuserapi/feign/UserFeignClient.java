package com.tw.cloud.user.api.springcloudfeignuserapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 17:28 2019/6/26
 */
@FeignClient(name = "springcloud-feign-user-provider")
public interface UserFeignClient {
    @RequestMapping("test")
    String findUserInfo(String userName);
}
