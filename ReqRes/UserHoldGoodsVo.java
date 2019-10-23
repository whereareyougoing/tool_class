package com.jd.jr.treasure.bussiness.export.xjk.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 宋艾衡
 * 2019/10/22 16:55
 *
 * 用户持仓产品vo
 *
 */

@Getter@Setter
public class UserHoldGoodsVo {
    private String one;

    @Override
    public String toString() {
        return "{"
                + "                        \"one\":\"" + one + "\""
                + "}";
    }
}
