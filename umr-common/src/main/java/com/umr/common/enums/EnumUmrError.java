package com.umr.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 异常码
 *
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/25 15:53
 */
@Getter
@AllArgsConstructor
public enum EnumUmrError {
    USER_EXIST("umr001", "用户已存在"),
    ;

    /** 状态码 */
    private String code;

    /** 状态描述 */
    private String description;

    /**
     * 根据编码查找枚举
     *
     * @param code 编码
     * @return {@link EnumUmrError } 实例
     **/
    public static EnumUmrError find(String code) {
        for (EnumUmrError instance : EnumUmrError.values()) {
            if (instance.getCode()
                .equals(code)) {
                return instance;
            }
        }
        return null;
    }
}
