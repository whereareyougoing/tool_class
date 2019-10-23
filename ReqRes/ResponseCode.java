package com.jd.jr.treasure.bussiness.common;

/**
 * 宋艾衡
 * 2019/10/21 16:00
 *
 * 响应码的枚举
 *
 */
public enum  ResponseCode {

    SUCCESS("0000","成功"),
    ERROR("0001","错误"),
    FAIL("0002","失败"),
    EXCEPTION("0003","异常"),
    ;

    /**
     * 响应码
     */
    private final String resultCode;

    /**
     * 响应信息，这个响应信息只是一般响应信息，具体业务场景里也可放自定义的响应信息
     */
    private final String resultInfo;


    ResponseCode(String resultCode,String resultInfo){
        this.resultCode = resultCode;
        this.resultInfo = resultInfo;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }
}
