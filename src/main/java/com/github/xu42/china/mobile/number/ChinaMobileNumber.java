package com.github.xu42.china.mobile.number;

import com.github.xu42.china.mobile.number.enums.ChinaMobileOperatorEnum;


/**
 * 中国移动通信运营商号码 服务
 */
public class ChinaMobileNumber {

    /**
     * 手机号格式是否合法
     */
    public static boolean isValid(String chinaMobileNumber) {
        return null != chinaMobileNumber && chinaMobileNumber.length() == 11 && chinaMobileNumber.startsWith("1");
    }

    /**
     * 获取所属通信运营商
     */
    public static ChinaMobileOperatorEnum getOperator(String chinaMobileNumber) {
        return ChinaMobileOperatorEnum.UNKNOWN;
    }

}
