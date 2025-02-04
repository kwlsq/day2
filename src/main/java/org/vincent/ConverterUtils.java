package org.vincent;

public class ConverterUtils {
    public static double fahrenheitToCelsiusConverter(double temperature){
        return ((temperature-32) * ((float) 5 /9));
    }

    public static double centimeterToKilometerConverter(double length){
        if(length < 0) {
            throw new IllegalArgumentException("Length must be positive numbers");
        }

        return length / 100000;
    }

}
