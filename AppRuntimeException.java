package com.jd.jr.marketing.platform.common.exception;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @author 宋艾衡
 * @date 2019/5/28 13:34
 * @desc 自定义异常，业务异常，构造函数控制是否打印堆栈信息，让打印异常性能变高
 */
public class AppRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String errorCode;
    private String errorMessage;
    private String showMessage;
    private Throwable cause;

    public AppRuntimeException() {
    }

    public AppRuntimeException(String errorCode) {
        this.errorCode = errorCode;
    }

    public AppRuntimeException(Throwable cause) {
        super(cause);
    }

    public AppRuntimeException(String errorCode, String errorMessage) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public AppRuntimeException(String errorCode, String errorMessage, String showMessage) {
        super(showMessage);
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.showMessage = showMessage;
    }

    public AppRuntimeException(String showMessage, Throwable cause) {
        super(showMessage, cause);
        this.showMessage = showMessage;
        this.cause = cause;
    }

    public AppRuntimeException(String errorCode, String errorMessage, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
        this.cause = cause;
        this.errorMessage = errorMessage;
    }

    public AppRuntimeException(String errorCode, String errorMessage, String showMessage, Throwable cause) {
        super(showMessage, cause);
        this.cause = cause;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.showMessage = showMessage;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getShowMessage() {
        return this.showMessage == null ? super.getMessage() : this.showMessage;
    }

    public void setShowMessage(String showMessage) {
        this.showMessage = showMessage;
    }
}
