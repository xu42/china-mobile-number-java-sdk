package com.github.xu42.china.mobile.number;


import com.github.xu42.china.mobile.number.enums.ChinaMobileOperatorEnum;
import com.github.xu42.china.mobile.number.exception.ChinaMobileNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChinaMobileNumberTest {

    private static final String[] chinaMobile = new String[]{
        "13401230000", "17051230000", "18812340000"
    };

    private static final String[] chinaUnicom = new String[]{
        "13001230000", "17041230000", "19612340000"
    };

    private static final String[] chinaTelecom = new String[]{
        "13491230000", "17400230000", "19912340000"
    };

    private static final String[] chinaBroadcasting = new String[]{
        "19291230000"
    };

    private static final String[] chinaTransport = new String[]{
        "17491230000"
    };

    private static final String[] unknown = new String[]{
        "11491230000"
    };

    private static final String[] mobilesError = new String[]{
        null, "", " ", "1380013800", "138001380000"
    };

    @Test
    public void isValid() {

        for (String mobile : chinaMobile) {
            Assertions.assertTrue(ChinaMobileNumber.isValid(mobile));
        }
        for (String mobile : chinaUnicom) {
            Assertions.assertTrue(ChinaMobileNumber.isValid(mobile));
        }
        for (String mobile : chinaTelecom) {
            Assertions.assertTrue(ChinaMobileNumber.isValid(mobile));
        }
        for (String mobile : chinaBroadcasting) {
            Assertions.assertTrue(ChinaMobileNumber.isValid(mobile));
        }
        for (String mobile : chinaTransport) {
            Assertions.assertTrue(ChinaMobileNumber.isValid(mobile));
        }
        for (String mobile : unknown) {
            Assertions.assertTrue(ChinaMobileNumber.isValid(mobile));
        }
        for (String mobile : mobilesError) {
            Assertions.assertFalse(ChinaMobileNumber.isValid(mobile));
        }
    }

    @Test
    public void getOperator() {

        for (String mobile : chinaMobile) {
            Assertions.assertEquals(ChinaMobileOperatorEnum.CHINA_MOBILE, ChinaMobileNumber.getOperator(mobile));
        }
        for (String mobile : chinaUnicom) {
            Assertions.assertEquals(ChinaMobileOperatorEnum.CHINA_UNICOM, ChinaMobileNumber.getOperator(mobile));
        }
        for (String mobile : chinaTelecom) {
            Assertions.assertEquals(ChinaMobileOperatorEnum.CHINA_TELECOM, ChinaMobileNumber.getOperator(mobile));
        }
        for (String mobile : chinaBroadcasting) {
            Assertions.assertEquals(ChinaMobileOperatorEnum.CHINA_BROADCASTING, ChinaMobileNumber.getOperator(mobile));
        }
        for (String mobile : chinaTransport) {
            Assertions.assertEquals(ChinaMobileOperatorEnum.CHINA_TRANSPORT, ChinaMobileNumber.getOperator(mobile));
        }
        for (String mobile : unknown) {
            Assertions.assertEquals(ChinaMobileOperatorEnum.UNKNOWN, ChinaMobileNumber.getOperator(mobile));
        }
        for (String mobile : mobilesError) {
            Assertions.assertThrows(ChinaMobileNumberException.class, () -> ChinaMobileNumber.getOperator(mobile));
        }
    }
}