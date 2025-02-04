package org.vincent;

public class StringUtils {
    public static String charRemover(String mainString, String searchString){
        return mainString.replaceFirst(searchString,"");
    }
}
