package com.jd.jr.treasure.bussiness.export.xjk.param;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 宋艾衡
 * 2019/10/23 10:08
 */

@Getter@Setter
public class UserQuery extends BaseQuery implements Serializable {

    private String chanele;

    public UserQuery(String merchantCode,String jrid,String chanele) {
        super(merchantCode,jrid);
        this.chanele = chanele;
    }

    @Override
    public String toString() {
        return "{"
                + "\"merchantCode\":\"" + super.getMerchantCode()
                + "                        \"chanele\":\"" + chanele + "\""
                + "}";
    }


    public static void main(String[] args) {
        UserQuery userQuery = new UserQuery("1", "2", "3");
        String json =  JSON.toJSONString(userQuery);
        System.out.println(json);
        System.out.println(userQuery);
    }
}
