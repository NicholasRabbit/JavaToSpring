package com.test.optional;

import com.test.optional.opt.Computer;
import com.test.optional.opt.SoundCardWithOptional;
import com.test.optional.opt.UsbWithOptional;
import com.test.optional.pojo.SoundCard;
import com.test.optional.pojo.Usb;

import java.util.Optional;

/**
 * The official documentation.
 * <a href="https://www.oracle.com/technical-resources/articles/java/java8-optional.html">Optional(Official Explanation)<a/>
 *
 *
 * What is the "Optional"?
 * It gives a programmer a chance to handle the "NullPointerException" in an API.
 * The purpose of it is not to replace all the null value but rather to help design
 * better APIs in which-just by reading the signature of a method-users can know what
 * they can expect from the "Optional".
 * */
public class OptionalTest {

    public static void main(String[] args) {
//        normalPattern();
        withOptional();
    }


    private static void normalPattern() {
        /**
         * Let's start with a question.
         * 1. What is possibly problematic with the following code?
         * If a computer like Raspberry Pi doesn't have any sound card, then a "NullPointer Exception" will be thrown
         * out.
         * 2. How to prevent unintended null pointer exception?
         * Normally, we can write cluttered code with "if statements" as follows.
         * */
        com.test.optional.pojo.Computer computer = new com.test.optional.pojo.Computer();
        String version = computer.getSoundCard().getUsb().getVersion();
        // Apparently, the code is not aesthetic as we expect.
        version = "UNKNOWN";
        if (computer != null) {
            SoundCard soundCard = computer.getSoundCard();
            if (soundCard != null) {
                Usb usb = soundCard.getUsb();
                if (usb != null) {
                    version = usb.getVersion();
                }
            }
        }
    }

    private static void withOptional() {
        /**
         * 3. Inspired from the idea of Haskell and Scala, Java SE8 introduced "Optional".
         * If a filed in a class is "Optional<T>", it means that the field is optional.
         * We can use it to make our code readable and free of null pointer exception.
         * The code is as follows.
         *
         * There is still a null pointer exception, I will figure it out later.
         * */
        Computer comp = new Computer();
        Optional<Computer>  computerOpt = Optional.ofNullable(comp);
        String version2 = computerOpt.flatMap(Computer::getSoundCard)
                .flatMap(SoundCardWithOptional::getUsb)
                .map(UsbWithOptional::getVersion)
                .orElse("UNKNOWN");
    }


}


