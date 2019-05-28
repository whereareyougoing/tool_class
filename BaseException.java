package com.jd.jr.marketing.platform.common.exception;

/**
 * @author 宋艾衡
 * @date 2019/5/27 17:37
 * @desc
 */
public class BaseException extends RuntimeException {


    static final long serialVersionUID = 1L;


    public BaseException() {
        super();
    }


    public BaseException(String message) {
        super(message);
    }


    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }


    public BaseException(Throwable cause) {
        super(cause);
    }


    protected BaseException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
