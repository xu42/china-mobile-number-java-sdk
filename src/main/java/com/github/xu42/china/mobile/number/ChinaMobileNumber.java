package com.github.xu42.china.mobile.number;

import com.github.xu42.china.mobile.number.enums.ChinaMobileOperatorEnum;
import com.github.xu42.china.mobile.number.utils.ChinaMobileNumberUtils;


/**
 * 中国移动通信运营商号码 服务
 */
public class ChinaMobileNumber {

    /**
     * 手机号格式是否合法
     *
     * @param chinaMobileNumber 手机号
     * @return 是否合法
     */
    public static boolean isValid(String chinaMobileNumber) {
        return ChinaMobileNumberUtils.isValid(chinaMobileNumber);
    }

    /**
     * 获取所属通信运营商
     * 不支持携号转网
     *
     * @param chinaMobileNumber 手机号
     * @return 运营商
     */
    public static ChinaMobileOperatorEnum getOperator(String chinaMobileNumber) {
        return ChinaMobileNumberUtils.getOperator(chinaMobileNumber);
    }

}
