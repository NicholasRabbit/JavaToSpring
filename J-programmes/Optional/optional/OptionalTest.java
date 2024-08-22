package com.test.optional;

import com.test.optional.opt.ComputerB;
import com.test.optional.opt.SoundCardB;
import com.test.optional.opt.UsbB;
import com.test.optional.pojo.Computer;
import com.test.optional.pojo.SoundCard;
import com.test.optional.pojo.Usb;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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

    @Test
    public void usualWay() {
        /**
         * Let's start with a question.
         * 1. What is possibly problematic with the following code?
         * If a computer like Raspberry Pi doesn't have any sound card, then a "NullPointer Exception" will be thrown
         * out.
         * 2. How to prevent unintended null pointer exception?
         * Normally, we can write cluttered code with "if statements" as follows.
         * */
        Computer computer = new Computer();
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

    @Test
    public void withOptional() {
        /**
         * 3. Inspired from the idea of Haskell and Scala, Java SE8 introduced "Optional".
         * If a filed in a class is "Optional<T>", it means that the field is optional.
         * We can use it to make our code readable and free of null pointer exception.
         * The code is as follows.
         *
         * There is still a null pointer exception, I will figure it out later.
         * */
        ComputerB comp = new ComputerB();

        SoundCardB soundCardB = new SoundCardB("Realtek");

        //soundCardB.setUsb(Optional.of(new UsbB("3.0")));
        soundCardB.setUsb(Optional.of(new UsbB()));

        comp.setSoundCard(Optional.of(soundCardB));

        Optional<ComputerB>  computerOpt = Optional.of(comp);

        String version = computerOpt.flatMap(ComputerB::getSoundCard)
                .flatMap(SoundCardB::getUsb)
                .map(UsbB::getVersion)
                .orElse("UNKNOWN");
        System.out.println("version is " + version);
    }

    @Test
    public void testMethodsOfOptional() {
         /**
         * 4. Perhaps it is too early to write the code shown in Step 3.
         * We should explore "Optional" at minor steps.
         * */
        // 4.1
        // empty(): An empty Optional
        Optional<SoundCardB> sc = Optional.empty();
        // of(): Return an Optional with the specific value which is not null.
        SoundCardB sc2 = new SoundCardB();
        Optional<SoundCardB> scOpt = Optional.of(sc2);
        System.out.println(scOpt);

        // ofNullable(): Return an Optional which may contain a null value.
        sc2 = null;
        Optional<SoundCardB> scOpt2 = Optional.ofNullable(sc2);
        System.out.println(scOpt2);

    }

    // 4.2 "ifPresent(...)"
    @Test
    public void testIfPresent() {
        // Do a null check in a usual way.
        SoundCardB sc = new SoundCardB();
        if (sc != null)
            System.out.println(sc);

        // Do a null check with "ifPresent()".
        Optional<SoundCardB> scb = Optional.of(sc);
        scb.ifPresent(System.out::println);

    }

    // 4.3 To get the default value.
    @Test
    public void testDefaultValues() {
        // The usual way is to use the ternary operator.
        SoundCardB maybe = null;
        SoundCardB sc = maybe != null ? maybe : new SoundCardB("Real Tech");

        // Use "orElse(...)"
        SoundCardB scEntity = Optional.ofNullable(maybe).orElse(new SoundCardB("Real Tech"));
        System.out.println(scEntity.getName());

        // We can also use "orElseThrow()" method, which instead of providing a default value if Optional is empty,
        // that throws an exception.
        maybe = null;
        try {
            SoundCardB scEntityE = Optional.ofNullable(maybe).orElseThrow(IllegalStateException::new);
            fail();
        } catch (RuntimeException e) {
            assertEquals(IllegalStateException.class, e.getClass());
        }

    }

    // 4.4 Rejecting certain values using "filter()" method.
    @Test
    public void testFilter() {
        // For example, we want to check if the usb port is a particular value.
        UsbB usb = new UsbB();
        usb.setVersion("3.0");
        // The usual way.
        if (usb != null && "3.0".equals(usb.getVersion()))
            System.out.println("The usb version is " + usb.getVersion());
        // Doing the same thing by using the filter method.
        Optional<UsbB> usbOpt = Optional.of(usb);
        usbOpt.filter(u -> "3.0".equals(u.getVersion()))
                .ifPresent(u -> System.out.println(u.getVersion()));

    }


    // 4.5 to be continued



}


