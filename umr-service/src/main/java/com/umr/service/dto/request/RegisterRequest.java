package com.umr.service.dto.request;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * 注册入参
 *
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/23 11:53
 */
@Data
@Builder
public class RegisterRequest implements Serializable {

    private static final long serialVersionUID = -826282974394251052L;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;
}
