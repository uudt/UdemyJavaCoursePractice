package dev.uudt;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);   // preffered way but unnecessary
        Integer deprecatedBoxing = new Integer(15);
        int unboxedInt = boxedInt.intValue();

        // Autoboxing and auto-unboxing
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }
}
