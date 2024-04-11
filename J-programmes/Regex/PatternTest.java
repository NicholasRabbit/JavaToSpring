package com.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

        //Compile the regular expression into a pattern (an instance).
        Pattern pattern = Pattern.compile("\\$\\{.+\\}");
        //To check if the given input matches the pattern which represents the regular expression.
        Matcher matcher = pattern.matcher("${foo}");

        /**
         * Attention: The find() is to find the next subsequence. If matches() were called before it, then the find() would to match the next subsequence.
         * Namely the find2 will be false after the 2.matches() was called.
         * */
        //1, find()
        boolean find = matcher.find();
        System.out.println("find: " + find);

        //2, Returns the input subsequence that matches the previous match.
        String group = matcher.group();
        System.out.println("group: " + group);

        //3, matches(): this method will move the cursor to the next subsequence so the find2() won't find anything.
        boolean doesMatch = matcher.matches();
        System.out.println("doesMatch:" + doesMatch);


        boolean find2 = matcher.find();
        System.out.println("find: " + find2);  //false



    }
}
