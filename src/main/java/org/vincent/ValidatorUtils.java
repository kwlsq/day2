package org.vincent;

import java.util.Objects;

public class ValidatorUtils {
    public static boolean evenValidators(int number){
        return number % 2 == 0;
    }

    public static String palindromeValidators(String inputString){
        if(Objects.equals(inputString.toLowerCase(), StringUtils.stringReverser(inputString).toLowerCase())){
            return "palindrome";
        } else {
            return "not palindrome";
        }
    }

}
