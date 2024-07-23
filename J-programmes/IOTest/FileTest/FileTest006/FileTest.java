package com.test.io.test;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.regex.Pattern;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Test with JUnit 4.6
 * */
public class FileTest {

    private String path;

    @Before
    public void setUp() throws Exception {
        path = "D:\\abcxxx.txt";
    }


    @Test
    public void testRenameTo() throws Exception {
        File f = new File(path);
        f.renameTo(new File("D:\\1-abcxxx.txt"));
    }

    @Test
    public void testSubString() throws Exception {
        String dirName = "1-abc";
        String substring = dirName.substring(0, 2);
        assertEquals("1-", substring);
    }

    @Test
    public void regexShouldMatchNumberAndDash() throws  Exception {
        String regex = "^\\d.*$";
        String dirName = "abc1-";
        Pattern compile = Pattern.compile(regex);
        boolean matches = compile.matcher(dirName).matches();

        assertFalse(matches);

    }

    @Test
    public void testGetCreateTime() throws Exception {
        File file = new File("D:\\1-abcxxx.txt");
        FileTime creationTime = (FileTime) Files.getAttribute(file.toPath(), "creationTime");
        long millis = creationTime.toMillis();
        Date date = new Date(millis);
        System.out.println(date);

    }

}
