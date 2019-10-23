package com.jd.jr.treasure.bussiness.common;


import java.io.Serializable;

/**
 * 宋艾衡
 * 2019/10/21 15:56
 *
 * 封装通用的返回结果
 *
 */
public class ServerResult implements Serializable {


    private static final long serialVersionUID = 94059244220359765L;
    /**
     * 响应状态码
     */
    private String resultCode;
    /**
     * 响应信息
     */
    private String resultInfo;

    private ServerResult() {
    }

    private ServerResult(String resultCode, String resultInfo) {
        this.resultCode = resultCode;
        this.resultInfo = resultInfo;
    }

    private ServerResult(String resultCode) {
        this.resultCode = resultCode;
    }

    public static ServerResult createBySuccess(){
        return new ServerResult(ResponseCode.SUCCESS.getResultCode(),  ResponseCode.SUCCESS.getResultInfo());
    }

    public static ServerResult createBySuccess(String msg){
        return new ServerResult(ResponseCode.SUCCESS.getResultCode(),msg);
    }

    public static ServerResult createByError(){
        return new ServerResult(ResponseCode.ERROR.getResultCode(),  ResponseCode.ERROR.getResultInfo());
    }

    public static ServerResult createByError(String msg){
        return new ServerResult(ResponseCode.ERROR.getResultCode(),  msg);
    }

    public static ServerResult createByFail(){
        return new ServerResult(ResponseCode.FAIL.getResultCode(),ResponseCode.FAIL.getResultInfo());
    }

    public static ServerResult createByFail(String msg){
        return new ServerResult(ResponseCode.FAIL.getResultCode(), msg);
    }

    public static ServerResult createByException(){
        return new ServerResult(ResponseCode.EXCEPTION.getResultCode(), ResponseCode.EXCEPTION.getResultInfo());
    }

    public static ServerResult createByException(String msg){
        return new ServerResult(ResponseCode.EXCEPTION.getResultCode(),msg);
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    @Override
    public String toString() {
        return "{"
                + "                        \"resultCode\":\"" + resultCode + "\""
                + ",                         \"resultInfo\":\"" + resultInfo + "\""
                + "}";
    }
}
