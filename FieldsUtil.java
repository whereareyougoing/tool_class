package com.jd.jr.baitiao.marketing.exchange.manage.util;

import com.jd.jr.baitiao.marketing.exchange.manage.domain.vo.ExchangeDefaultActivity;

import java.lang.reflect.Field;

/**
 * @author 宋艾衡
 * @date 2019/6/6 18:18
 * @desc
 */
public class FieldsUtil {

    public static <T> StringBuilder get(Class<T> clazz){

        StringBuilder sb = new StringBuilder();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            sb.append(name);
            sb.append("  ");
        }

        return sb;
    }

    public static <T> List<String> getAsJson(Class<T> clazz){
        Field[] fields = clazz.getDeclaredFields();
        List<String> list = new ArrayList<>();
        for (Field field : fields) {
            if (field.getGenericType().toString().equals("class java.lang.String")){
                String json = "\""+field.getName()+"\""+":"+"\"\""+",";
                list.add(json);
            }else if (field.getGenericType().toString().equals("class java.util.Date")){
                String json = "\""+field.getName()+"\""+":"+"1559054890000"+",";
                list.add(json);
            }else {
                String json = "\""+field.getName()+"\""+":"+"null"+",";
                list.add(json);
            }
        }
        return list;
    }

    public static <T> void print(Class<T> clazz){
        for (String s : getAsJson(clazz)) {
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
//        StringBuilder sb = get(ActivityExchangeCouponSyncTask.class);
//        System.out.println(sb);

//        StringBuilder sb = get(Rule.class);
//        System.out.println(sb);

        StringBuilder sb = get(ExchangeDefaultActivity.class);
        System.out.println(sb);
    }

}
