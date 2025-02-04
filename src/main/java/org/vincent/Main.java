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

        System.out.println(Constants.NUMBER + " isEven: "
                + ValidatorUtils.evenValidators(Constants.NUMBER)
        );

        System.out.println("String = " + Constants.MAIN_STRING + ". search string = "
                + Constants.SEARCH_STRING + ". result = " +
                StringUtils.charRemover(Constants.MAIN_STRING,Constants.SEARCH_STRING)
        );

        System.out.println("Input = " + Constants.PALINDROME_INPUT + ". it is " +
                ValidatorUtils.palindromeValidators(Constants.PALINDROME_INPUT)
        );
    }
}