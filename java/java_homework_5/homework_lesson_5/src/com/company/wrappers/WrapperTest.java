package com.company.wrappers;

public class WrapperTest {
    public static void main(String[] args) {

        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Double d1 = 10.5;
        Double d2 = Double.valueOf(10.5);
        Double d3 = new Double(10.5);
        Double d4 = Double.parseDouble("10.5");


        Double doubleValue = 123.45;

        byte bValue = doubleValue.byteValue();
        short sValue = doubleValue.shortValue();
        int iValue = doubleValue.intValue();
        float fValue = doubleValue.floatValue();
        long lValue = doubleValue.longValue();


        Double zero = 0.0;
        Double nonZero = 10.0;

        Double nanValue = nonZero / zero;
        Double infinityValue = zero / zero;

        System.out.println("nanValue: " + nanValue);
        System.out.println("infinityValue: " + infinityValue);

        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        }

        if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue = Infinity");
        }


        Long long1 = 120L;
        Long long2 = 120L;

        System.out.println("Сравнение 120: " + (long1 == long2));

        long1 = 1200L;
        long2 = 1200L;

        System.out.println("Сравнение 1200: " + (long1 == long2));
    }
}
