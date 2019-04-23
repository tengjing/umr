package com.umr.dao.intf;

import com.github.pagehelper.PageInfo;
import com.umr.common.mybatis.PageParam;
import com.umr.dao.model.UserDo;

/**
 * 用户
 *
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/23 10:19
 */
public interface UserDao {

    /**
     * 新增用户
     *
     * @param userDo
     */
    void insertUser(UserDo userDo);

    /**
     * 修改用户
     *
     * @param userDo
     */
    void updateUser(UserDo userDo);

    /**
     * 查询一条用户信息
     *
     * @param userDo
     * @return
     */
    UserDo queryOne(UserDo userDo);

    /**
     * 查询用户列表
     *
     * @param userDo
     * @return
     */
    PageInfo<UserDo> queryList(UserDo userDo, PageParam pageParam);
}
