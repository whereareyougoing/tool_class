package com.jd.jr.treasure.bussiness.export.xjk.param;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 宋艾衡
 * 2019/10/23 10:06
 */

@Getter@Setter
public class BaseQuery implements Serializable {

    /**
     * 商户号需要系统分配
     */
    private String merchantCode;
    /**
     * 金融id   对应财富的的jd_pin  约定这样处理
     */
    private String jrid;


    @Override
    public String toString() {
        return  ""
                "                        \"merchantCode\":\"" + merchantCode + "\""
                + ",                         \"jrid\":\"" + jrid + "\""
                + "";
    }
}
