package com.jd.jr.marketing.platform.service;

import com.jd.jr.marketing.platform.api.activity.dto.*;
import com.jd.jr.marketing.platform.api.apply.dto.ActivityApplyInfoDto;
import com.jd.jr.marketing.platform.api.apply.dto.rich.PermissionDto;
import com.jd.jr.marketing.platform.api.user.dto.OrganizationDto;
import com.jd.jr.marketing.platform.api.user.dto.UserOrganizationMappingDto;

import java.lang.reflect.Field;

/**
 * @author 宋艾衡
 * @date 2019/5/20 14:05
 * @desc
 *
 * 获取属性名，生成toString方法
 *
 */
public class PropertiesUtil {

    public static StringBuilder getPropertyName(Class clazz){

        StringBuilder sb = new StringBuilder();

        String className = clazz.getSimpleName();
        sb.append("\""+className+"={\"" + "+");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            if (field.getGenericType().getTypeName().equalsIgnoreCase("java.lang.String")){
                sb.append("\","+fieldName+"='\""+"+"+fieldName+"+"+"'"+"\\'"+"'"+"+");
            }else {
                sb.append("\","+fieldName+"=\""+"+"+fieldName+"+");
            }
        }

        sb.append("\""+"}"+"\""+";");

        return sb;
    }

    public static void print(Class clazz){
        String className = clazz.getSimpleName();
        System.out.println("\""+className+"={\"" + "+");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0;i<fields.length;i++) {
            String fieldName = fields[i].getName();
            if (i == 0){
                if (fields[i].getGenericType().getTypeName().equalsIgnoreCase("java.lang.String")){
                    System.out.println("\""+fieldName+"='\""+"+"+fieldName+"+"+"'"+"\\'"+"'"+"+");
                }else {
                    System.out.println("\""+fieldName+"=\""+"+"+fieldName+"+");
                }
            }else {
                if (fields[i].getGenericType().getTypeName().equalsIgnoreCase("java.lang.String")){
                    System.out.println("\","+fieldName+"='\""+"+"+fieldName+"+"+"'"+"\\'"+"'"+"+");
                }else {
                    System.out.println("\","+fieldName+"=\""+"+"+fieldName+"+");
                }
            }

        }

        System.out.println("\""+"}"+"\""+";");
    }

    public static void main(String[] args) {

//        StringBuilder sb1 = getPropertyName(ActivityDto.class);
//        System.out.println(sb1.toString());
//
//        StringBuilder sb2 = getPropertyName(RuleDto.class);
//        System.out.println(sb2.toString());
//
//        StringBuilder sb3 = getPropertyName(OrganizationDto.class);
//        System.out.println(sb3.toString());
//
//        StringBuilder sb4 = getPropertyName(UserOrganizationMappingDto.class);
//        System.out.println(sb4.toString());

//        print(ActivityDto.class);
//        print(ActivityApplyInfoDto.class);
//        print(SettlementActivityInvestorDto.class);
//        print(RuleDto.class);
//        print(OrganizationDto.class);
        print(UserOrganizationMappingDto.class);
//        print(PermissionDto.class);
//        print(ActivityAlarmCfgDto.class);
//        print(ActivityLogDto.class);
//        print(ActivityRuleDto.class);
//        print(ActivityRuleEnumDto.class);
//        print(BenefitDto.class);
//        print(ActivityRulePackageDto.class);

    }
}
