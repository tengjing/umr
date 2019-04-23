package com.umr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umr.dao.intf.UserDao;
import com.umr.service.intf.UserService;

/**
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/23 11:42
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register() {

    }

    @Override
    public void signIn() {

    }

    @Override
    public void signOut() {

    }
}
