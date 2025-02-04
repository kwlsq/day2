package org.vincent;

public class MetricLengthUtils {
    public static double centimeterToKilometerConverter(double length){
        if(length < 0) {
            throw new IllegalArgumentException("Length must be positive numbers");
        }

        return length / 100000;
    }
}
