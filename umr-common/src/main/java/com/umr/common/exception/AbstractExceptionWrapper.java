package com.umr.common.exception;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import lombok.Getter;

/**
 * 自定义异常
 *
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/24 11:37
 */
@Getter
public class AbstractExceptionWrapper extends RuntimeException {

    private static final long serialVersionUID = -5924894341669118593L;
    /**
     * 异常code
     */
    protected String errorCode;

    /**
     * 异常描述
     */
    protected String errorMessage;

    /**
     * 抛异常的类
     */
    protected Class<?> clazz;

    public AbstractExceptionWrapper() {
    }

    public AbstractExceptionWrapper(String message) {
        super(message);
        this.errorMessage = message;
    }

    public AbstractExceptionWrapper(String message, Throwable cause) {
        super(message, cause);
        this.errorMessage = message;
    }

    public AbstractExceptionWrapper(Throwable cause) {
        super(cause);
    }

    public AbstractExceptionWrapper(String message, Throwable cause, boolean enableSuppression,
        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorMessage = message;
    }

    /**
     * 格式化文本
     *
     * @param template 文本模板，被替换的部分用 {} 表示
     * @param values 参数值
     * @return 格式化后的文本
     */
    protected static String format(String template, Object... values) {
        if (ArrayUtils.isEmpty(values)) {
            return template;
        }
        // 由于String.format针对于%有特殊处理，所以需要转义下
        String replacedTemplate = template.replace("%", "%%");
        return StringUtils.isBlank(template) ? StringUtils.EMPTY : String.format(replacedTemplate.replace("{}", "%s"),
            values);
    }
}
