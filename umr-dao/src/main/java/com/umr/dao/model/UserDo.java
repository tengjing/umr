package com.umr.dao.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: user
 */
@Data
public class UserDo {
    /**
     * 用户编号
     *
     * Table:     user
     * Column:    user_id
     * Nullable:  false
     */
    private String userId;

    /**
     * 账号
     *
     * Table:     user
     * Column:    account
     * Nullable:  false
     */
    private String account;

    /**
     * 密码
     *
     * Table:     user
     * Column:    password
     * Nullable:  false
     */
    private String password;

    /**
     * 密码错误次数
     *
     * Table:     user
     * Column:    pwd_errors
     * Nullable:  true
     */
    private Integer pwdErrors;

    /**
     * 上次登录时间
     *
     * Table:     user
     * Column:    last_login_time
     * Nullable:  true
     */
    private Date lastLoginTime;

    /**
     * 创建时间
     *
     * Table:     user
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * Table:     user
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    /**
     * 状态
     *
     * Table:     user
     * Column:    status
     * Nullable:  true
     */
    private String status;
}