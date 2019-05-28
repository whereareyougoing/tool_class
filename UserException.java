package com.jd.jr.marketing.platform.common.exception;

/**
 * @author 宋艾衡
 * @date 2019/5/27 17:31
 * @desc
 */
public class UserException extends BaseException{

    /**
     * 仅包含message, 没有cause, 也不记录栈异常, 性能最高
     * @param msg
     */
    public UserException(String msg) {
        this(msg, false);
    }

    /**
     * 包含message, 可指定是否记录栈异常
     * @param msg
     * @param recordStackTrace
     */
    public UserException(String msg, boolean recordStackTrace) {
        super(msg, null, false, recordStackTrace);
    }

    /**
     * 包含message和cause, 会记录栈异常
     * @param msg
     * @param cause
     */
    public UserException(String msg, Throwable cause) {
        super(msg, cause, false, true);
    }

}
