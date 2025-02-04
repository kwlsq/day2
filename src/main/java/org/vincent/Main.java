package org.vincent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println(Constants.TEMPERATURE + " Fahrenheit = "
                + ConverterUtils.fahrenheitToCelsiusConverter(Constants.TEMPERATURE) + " Celsius"
        );

        System.out.println(Constants.LENGTH + " cm = "
                + ConverterUtils.centimeterToKilometerConverter(Constants.LENGTH) + " km"
        );

    }
}