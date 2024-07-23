package com.test.io.test;

import com.test.io.util.RenameFileUtil;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class RenameFileTest {


    private RenameFileUtil fileUtil;


    @Before
    public void setUp() throws Exception{
        fileUtil = new RenameFileUtil();
    }

    /**
     * Rename files with sequential numbers and dashed by the order of created time.
     *
     * 1, TODO  to get the list of files in  a directory.
     * 2, TODO  to sort the list in a chronological order.
     * 2, TODO  to get the name of each file.
     * 3, TODO  to rename the name fo each file by adding a sequential number and a dash as prefix.
     * */
    @Test
    public void shouldGetAllFiles() throws Exception {
        assertNotNull(fileUtil.getFileList());
    }

    // 1.
    @Test
    public void shouldGetFileListLargerThanZero() throws Exception {
        assertTrue("List should not be empty.", fileUtil.getFileList().size() > 0);
    }

    // 2.

    // 3.
    @Test
    public void shouldGetNameOfEachFile() throws Exception {
        boolean isEmptyName = false;
        for (File file : fileUtil.getFileList()) {
            if (file.getName().equals("") || file.getName() == null) {
                isEmptyName = true;
            }
        }
        assertFalse(isEmptyName);
    }

    // 4.
    @Test
    public void shouldRenameFilesWithPrefixOfNumberAndDash() throws Exception {
        List<File> fileList = fileUtil.getFileList();
        List<File> renamedFileList = fileUtil.renameFileByNumberAndDash(fileList);
        assertTrue(renamedFileList.size() > 0);

        String regex = "^\\d.*$";
        boolean expected = true;
        for (File f : renamedFileList) {
            Pattern compile = Pattern.compile(regex);
            boolean matches = compile.matcher(f.getName()).matches();
            if (!matches)
                expected = false;
        }

        assertTrue(expected);
    }


}
