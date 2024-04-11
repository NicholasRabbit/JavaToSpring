package com.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

        //Compile the regular expression into a pattern (an instance).
        Pattern pattern = Pattern.compile("\\$\\{.+\\}");
        //To check if the given input matches the pattern which represents the regular expression.
        Matcher matcher = pattern.matcher("${foo}");
        boolean doesMatch = matcher.matches();
        System.out.println("doesMatch:" + doesMatch);

    }
}
