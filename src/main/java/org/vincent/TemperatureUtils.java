package org.vincent;

public class TemperatureUtils {
    public static float fahrenheitToCelsiusConverter(float temperature){
        return ((temperature-32) * ((float) 5 /9));
    }
}
