package com.umr.common.exception;

/**
 * 自定义异常构造
 *
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/24 11:39
 */
public class UmrException extends AbstractExceptionWrapper {

    private static final long serialVersionUID = 3780394087516409112L;

    /**
     * 异常构造函数
     *
     * @param errorCode 异常code
     * @param errorMessage 异常描述
     * @param params 描述中的占位符替换值
     */
    public UmrException(String errorCode, String errorMessage, String... params) {
        super(format(errorMessage, (Object[]) params));
        this.errorCode = errorCode;
        this.errorMessage = format(errorMessage, (Object[]) params);
    }

    /**
     * 异常构造函数
     *
     * @param t 异常
     * @param errorCode 异常code
     * @param errorMessage 异常描述
     * @param params 描述中的占位符替换值
     */
    public UmrException(Throwable t, String errorCode, String errorMessage, String... params) {
        super(format(errorMessage, (Object[]) params), t);
        this.errorCode = errorCode;
        this.errorMessage = format(errorMessage, (Object[]) params);
    }

    /**
     * 异常构造函数，为了兼容老的异常
     *
     * @param errorCode 异常code
     * @param errorMessage 异常描述
     * @param t 异常
     */
    public UmrException(String errorCode, String errorMessage, Throwable t) {
        super(errorMessage, t);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * 异常构造函数，为了兼容老的异常
     *
     * @param errorCode 异常code
     * @param errorMessage 异常描述
     * @param clazz 抛出异常的class类
     * @param t 异常
     */
    public UmrException(String errorCode, String errorMessage, Class<?> clazz, Throwable t) {
        super(errorMessage, t);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.clazz = clazz;
    }

    /**
     * 异常构造函数
     *
     * @param errorCode 异常code
     * @param errorMessage 异常描述
     * @param clazz 抛出异常的class类
     * @param params 描述中的占位符替换值
     */
    public UmrException(String errorCode, String errorMessage, Class<?> clazz, String... params) {
        super(format(errorMessage, (Object[]) params));
        this.errorCode = errorCode;
        this.errorMessage = format(errorMessage, (Object[]) params);
        this.clazz = clazz;
    }

    /**
     * 异常构造函数
     *
     * @param t 异常
     * @param errorCode 异常code
     * @param errorMessage 异常描述
     * @param clazz 抛出异常的class类
     * @param params 描述中的占位符替换值
     */
    public UmrException(Throwable t, String errorCode, String errorMessage, Class<?> clazz, String... params) {
        super(format(errorMessage, (Object[]) params), t);
        this.errorCode = errorCode;
        this.errorMessage = format(errorMessage, (Object[]) params);
        this.clazz = clazz;
    }
}
