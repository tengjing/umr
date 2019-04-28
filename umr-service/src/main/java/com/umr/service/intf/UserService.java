package com.umr.service.intf;

import com.umr.service.dto.request.RegisterRequest;

/**
 * 用户操作
 *
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/23 11:42
 */
public interface UserService {

    /**
     * 注册
     */
    void register(RegisterRequest request);

    /**
     * 登录
     */
    void signIn();

    /**
     * 登出
     */
    void signOut();
}
