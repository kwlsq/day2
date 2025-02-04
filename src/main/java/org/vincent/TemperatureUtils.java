package org.vincent;

public class TemperatureUtils {
    public static double fahrenheitToCelsiusConverter(double temperature){
        return ((temperature-32) * ((float) 5 /9));
    }
}
