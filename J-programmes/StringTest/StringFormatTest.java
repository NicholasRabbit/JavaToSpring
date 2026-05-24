package test;

/*
* JDK 25
* */
import module java.base;
import static java.lang.IO.*;

public class StringFormatTest {

    static void main() {
        println("-".repeat(15));
        println(String.format("%15s", "%15s"));     //
        println(String.format("%-15s", "%-15s"));

        /*
        * Note that for numbers you should specify the number of columns by "%10f" or "%d" as
        * that in strings, or the output will be corresponded to the length of input.
        * */
        println("Numbers:" + "-".repeat(20));
        int i = 1234;
        println(String.format("|%d|", i));
        println(String.format("|%10d|", i));
        println(String.format("|%-10d|", i));
        float f = 1.5f;
        println(String.format("|%10f|", f));  // By default, numbers are aligned right.
        println(String.format("|%10.2f|", f));  // By default, numbers are aligned right.
        println(String.format("|%-10.2f|", f));

    }
}
