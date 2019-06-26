package com.tw.user.provider.springcloudfeignuserprovider.Controller;

import com.tw.common.exception.TwException;
import com.tw.user.provider.springcloudfeignuserprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 17:10 2019/6/26
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public String findUserInfo(String userName) throws TwException {
        return userService.findUserByName(userName);
    }
}
