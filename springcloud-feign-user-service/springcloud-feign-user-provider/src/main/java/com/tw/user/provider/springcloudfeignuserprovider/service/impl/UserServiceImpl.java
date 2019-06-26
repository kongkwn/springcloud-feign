package com.tw.user.provider.springcloudfeignuserprovider.service.impl;

import com.tw.user.provider.springcloudfeignuserprovider.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 17:08 2019/6/26
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String findUserByName(String userName) {
        return userName;
    }
}
