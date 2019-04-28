package com.umr.service.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

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
    @NotBlank(message = "账号不能为空")
    private String account;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;
}
