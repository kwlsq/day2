package org.vincent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static double temperature = 1.5;
    static double length = 200000;
    public static void main(String[] args) {
        System.out.println(
                temperature + " Fahrenheit = "
                + TemperatureUtils.fahrenheitToCelsiusConverter(temperature) + " Celsius"
        );

        System.out.println(
                length + " cm = "
                        + MetricLengthUtils.centimeterToKilometerConverter(length) + " km"
        );

    }
}