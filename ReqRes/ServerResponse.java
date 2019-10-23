package com.jd.jr.treasure.bussiness.export.xjk.response;

import com.jd.jr.treasure.bussiness.common.ServerResult;

import java.io.Serializable;

/**
 * 宋艾衡
 * 2019/10/21 16:33
 *
 * 通用的响应返回类
 *
 */
public class ServerResponse<T> implements Serializable {

    private ServerResult result;
    private T data;

    public ServerResponse() {
    }

    private ServerResponse(ServerResult result, T data) {
        this.result = result;
        this.data = data;
    }

    private ServerResponse(ServerResult result) {
        this.result = result;
    }

    public static <T> ServerResponse<T> returnSuccess(){
        return new ServerResponse<>(ServerResult.createBySuccess());
    }

    public static <T> ServerResponse<T> returnSuccess(T data){
        return new ServerResponse<>(ServerResult.createBySuccess(), data);
    }

    public static <T> ServerResponse<T> returnSuccess(String resultInfo,T data){
        return new ServerResponse<>(ServerResult.createBySuccess(resultInfo), data);
    }

    public static <T> ServerResponse<T> returnError(){
        return new ServerResponse<>(ServerResult.createByError());
    }

    public static <T> ServerResponse<T> returnError(T data){
        return new ServerResponse<>(ServerResult.createByError(),data);
    }

    public static <T> ServerResponse<T> returnError(String resultInfo,T data){
        return new ServerResponse<>(ServerResult.createByError(resultInfo),data);
    }

    public static <T> ServerResponse<T> returnFail(){
        return new ServerResponse<>(ServerResult.createByError());
    }

    public static <T> ServerResponse<T> returnFail(T data){
        return new ServerResponse<>(ServerResult.createByError(),data);
    }

    public static <T> ServerResponse<T> returnFail(String resultInfo,T data){
        return new ServerResponse<>(ServerResult.createByError(resultInfo),data);
    }

    public static <T> ServerResponse<T> returnException(){
        return new ServerResponse<>(ServerResult.createByError());
    }

    public static <T> ServerResponse<T> returnException(T data){
        return new ServerResponse<>(ServerResult.createByError(),data);
    }

    public static <T> ServerResponse<T> returnException(String resultInfo,T data){
        return new ServerResponse<>(ServerResult.createByError(resultInfo),data);
    }


}
