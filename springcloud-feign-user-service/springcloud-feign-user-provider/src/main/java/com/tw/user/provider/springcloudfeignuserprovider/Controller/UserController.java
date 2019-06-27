package com.tw.user.provider.springcloudfeignuserprovider.Controller;

import com.tw.common.exception.TwException;
import com.tw.user.provider.springcloudfeignuserprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 17:10 2019/6/26
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    @ResponseBody
    public String findUserInfo(@RequestParam("userName") String userName) throws TwException {
        return userService.findUserByName(userName);
    }
}
