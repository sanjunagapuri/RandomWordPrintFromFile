package com.thr.code.challenge;

import com.thr.code.challenge.FileReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * com.thr.code.challenge.FileReaderTest class to test the methods in com.thr.code.challenge.FileReader class.
 *
 * @author Sanjay Nagapuri
 *
 */

public class FileReaderTest {
    private FileReader fileReader;
    private String TEST_WORDS_FILE_PATH = "./src/test/resources/test_words.txt";
    private String EMPTY_WORDS_FILE_PATH = "./src/test/resources/empty_words.txt";
    private String FILE_NOT_FOUND_PATH = "./wrong/path/test_words.txt";

    /* Test to read file with Multiple wordslist in a given file*/
    @Test
    public void testReadFileWithList() throws FileNotFoundException{
        fileReader = new FileReader(TEST_WORDS_FILE_PATH);
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("a");
        expectedList.add("aa");
        expectedList.add("aaa");
        expectedList.add("aah");
        expectedList.add("aahed");

        Assert.assertEquals(expectedList, fileReader.readFile());

    }

    /* Test to read file with no words present in a given file*/
    @Test
    public void testReadFileWithEmptyList() throws FileNotFoundException{
        fileReader = new FileReader(EMPTY_WORDS_FILE_PATH);
        List<String> expectedList = new ArrayList<String>();
            Assert.assertEquals(expectedList, fileReader.readFile());
    }

    /* Test to read file with no file found at given file path*/
    @Test(expected= FileNotFoundException.class)
    public void testReadFileNotFound() throws FileNotFoundException{
        fileReader = new FileReader(FILE_NOT_FOUND_PATH);
        List<String> expectedList = new ArrayList<String>();
        fileReader.readFile();
    }
}