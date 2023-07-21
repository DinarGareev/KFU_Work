package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramPatternMatcher {
    public static void main(String[] args) {
        String string1 = "hello";
        boolean boolean1 = Pattern.matches("Hello",string1);
        if (boolean1){
            System.out.println("Совпало");
        }
        else {
            System.out.println("Не совпало");
        }
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher(string1);
        boolean found = matcher.matches();
        if (found){
            System.out.println("совпало");
        }
        else {
            System.out.println("не совпало");
        }
    }
}
