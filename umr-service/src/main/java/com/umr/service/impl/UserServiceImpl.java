package com.umr.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umr.common.enums.EnumUmrError;
import com.umr.common.exception.UmrException;
import com.umr.common.utils.SnowflakesUtil;
import com.umr.dao.intf.UserDao;
import com.umr.dao.model.UserDo;
import com.umr.service.dto.request.RegisterRequest;
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
    public void register(RegisterRequest request) {
        UserDo userDo = new UserDo();
        userDo.setAccount(request.getAccount());
        UserDo user = userDao.queryOne(userDo);
        //用户已存在，抛异常
        if (!Objects.equals(null, user)) {
            throw new UmrException(EnumUmrError.USER_EXIST.getCode(), EnumUmrError.USER_EXIST.getDescription());
        }
        userDo.setPassword(request.getPassword());
        userDo.setUserId(SnowflakesUtil.getNextId());
        userDao.insertUser(userDo);
    }

    @Override
    public void signIn() {

    }

    @Override
    public void signOut() {

    }
}
