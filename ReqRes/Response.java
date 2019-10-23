package com.jd.jr.treasure.bussiness.export.xjk.response;

import com.alibaba.fastjson.JSON;
import com.jd.jr.treasure.bussiness.common.ServerResult;
import com.jd.jr.treasure.bussiness.export.xjk.vo.UserHoldGoodsVo;
import com.jd.jr.treasure.bussiness.export.xjk.vo.UserHoldVo;

/**
 * 宋艾衡
 * 2019/10/23 9:23
 *
 * 通用的响应类，
 *
 */
public class Response<V,T> {

    private V result;
    private T data;


    public Response(V result, T data) {
        this.result = result;
        this.data = data;
    }

    public static <V,T> Response<V,T> returnSuccess(V result,T data){
        return new Response<>(result, data);
    }

    public V getResult() {
        return result;
    }

    public void setResult(V result) {
        this.result = result;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{"
                + "                        \"result\":" + result
                + ",                         \"data\":" + data
                + "}";
    }

    public static void main(String[] args) {
        UserHoldGoodsVo tradeDetailVo = new UserHoldGoodsVo();
        tradeDetailVo.setOne("1");
        Response response = Response.returnSuccess(ServerResult.createBySuccess(), tradeDetailVo);
        String json = JSON.toJSONString(response);
        System.out.println(json);
        System.out.println(response.toString());
    }
}
