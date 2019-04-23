package com.umr.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.umr.common.mybatis.PageParam;
import com.umr.dao.intf.UserDao;
import com.umr.dao.mapper.UserDoMapper;
import com.umr.dao.model.UserDo;
import com.umr.dao.model.UserDoExample;

/**
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/23 10:22
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private UserDoMapper userDoMapper;

    @Override
    public void insertUser(UserDo userDo) {
        userDoMapper.insertSelective(userDo);
    }

    @Override
    public void updateUser(UserDo userDo) {
        userDoMapper.updateByPrimaryKeySelective(userDo);
    }

    @Override
    public UserDo queryOne(UserDo userDo) {
        List<UserDo> list = userDoMapper.selectByExample(buildExample(userDo));
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public PageInfo<UserDo> queryList(UserDo userDo, PageParam pageParam) {
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageNum());
        return new PageInfo<>(userDoMapper.selectByExample(buildExample(userDo)));
    }

    UserDoExample buildExample(UserDo userDo) {
        UserDoExample userDoExample = new UserDoExample();
        UserDoExample.Criteria criteria = userDoExample.createCriteria();
        if (StringUtils.isNotBlank(userDo.getAccount())) {
            criteria.andAccountEqualTo(userDo.getAccount());
        }
        if (StringUtils.isNotBlank(userDo.getPassword())) {
            criteria.andPasswordEqualTo(userDo.getPassword());
        }
        if (StringUtils.isNotBlank(userDo.getStatus())) {
            criteria.andStatusEqualTo(userDo.getStatus());
        }
        if (StringUtils.isNotBlank(userDo.getUserId())) {
            criteria.andUserIdEqualTo(userDo.getUserId());
        }
        if (userDo.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(userDo.getCreateTime());
        }
        if (userDo.getLastLoginTime() != null) {
            criteria.andLastLoginTimeEqualTo(userDo.getLastLoginTime());
        }
        if (userDo.getUpdateTime() != null) {
            criteria.andUpdateTimeEqualTo(userDo.getUpdateTime());
        }
        if (userDo.getPwdErrors() != null) {
            criteria.andPwdErrorsEqualTo(userDo.getPwdErrors());
        }
        return userDoExample;
    }
}
