package com.github.xu42.china.mobile.number.utils;


import com.github.xu42.china.mobile.number.enums.ChinaMobileOperatorEnum;
import com.github.xu42.china.mobile.number.exception.ChinaMobileNumberException;

import static com.github.xu42.china.mobile.number.enums.ChinaMobileOperatorEnum.*;

/**
 * 工具类
 */
public class ChinaMobileNumberUtils {

    /**
     * 中国移动号段
     */
    private static final String[] CHINA_MOBIlE_ARRAY = new String[]{
        "1340", "1341", "1342", "1343", "1344", "1345", "1346", "1347", "1348",
        "135", "136", "137", "138", "139", "144", "147", "148", "150", "151", "152", "157", "158", "159",
        "165", "1703", "1705", "1706", "172", "178", "182", "183", "184", "187", "188", "195", "197", "198"
    };

    /**
     * 中国联通号段
     */
    private static final String[] CHINA_UNICOM_ARRAY = new String[]{
        "130", "131", "132", "145", "146", "155", "156", "166",
        "167", "171", "1704", "1707", "1708", "1709",
        "175", "176", "185", "186", "196"
    };

    /**
     * 中国电信号段
     */
    private static final String[] CHINA_TELECOM_ARRAY = new String[]{
        "133", "1349", "1410", "149", "153", "173", "162", "1700", "1701", "1702",
        "17400", "17401", "17402", "17403", "17405", "177", "180", "181", "189",
        "190", "191", "193", "199"
    };

    /**
     * 中国广电号段
     */
    private static final String[] CHINA_BROADCASTING_ARRAY = new String[]{
        "192"
    };

    /**
     * 中国交通运输通信号段
     */
    private static final String[] CHINA_TRANSPORT_ARRAY = new String[]{
        "1749"
    };


    /**
     * 手机号是否合法
     *
     * @param chinaMobileNumber 手机号
     * @return 是否合法
     */
    public static boolean isValid(String chinaMobileNumber) {
        return null != chinaMobileNumber && chinaMobileNumber.length() == 11 && chinaMobileNumber.startsWith("1");
    }

    /**
     * 由手机号获取其运营商
     *
     * @param chinaMobileNumber 手机号
     * @return 运营商
     */
    public static ChinaMobileOperatorEnum getOperator(String chinaMobileNumber) {

        if (!isValid(chinaMobileNumber)) {
            throw new ChinaMobileNumberException("mobile number invalid");
        }

        if (isChinaMobile(chinaMobileNumber)) {
            return CHINA_MOBILE;
        }

        if (isChinaTelecom(chinaMobileNumber)) {
            return CHINA_TELECOM;
        }

        if (isChinaUnicom(chinaMobileNumber)) {
            return CHINA_UNICOM;
        }

        if (isChinaBroadcasting(chinaMobileNumber)) {
            return CHINA_BROADCASTING;
        }

        if (isChinaTransport(chinaMobileNumber)) {
            return CHINA_TRANSPORT;
        }

        return UNKNOWN;
    }


    private static boolean isChinaMobile(String number) {
        return isXX(CHINA_MOBIlE_ARRAY, number);
    }


    private static boolean isChinaUnicom(String number) {
        return isXX(CHINA_UNICOM_ARRAY, number);
    }


    private static boolean isChinaTelecom(String number) {
        return isXX(CHINA_TELECOM_ARRAY, number);
    }


    private static boolean isChinaBroadcasting(String number) {
        return isXX(CHINA_BROADCASTING_ARRAY, number);
    }


    private static boolean isChinaTransport(String number) {
        return isXX(CHINA_TRANSPORT_ARRAY, number);
    }


    private static boolean isXX(String[] xx, String number) {

        for (String s : xx) {
            if (number.startsWith(s)) {
                return true;
            }
        }

        return false;
    }

}
