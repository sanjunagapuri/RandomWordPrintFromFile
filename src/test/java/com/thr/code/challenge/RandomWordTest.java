package com.thr.code.challenge;

import com.thr.code.challenge.RandomWord;
import org.junit.Assert;
import org.junit.Test;

/**
 * com.thr.code.challenge.RandomWordTest class to test the methods in com.thr.code.challenge.RandomWord class.
 *
 * @author Sanjay Nagapuri
 *
 */

public class RandomWordTest {

    private RandomWord randomWord;
    private String TEST_WORDS_FILE_PATH = "./src/test/resources/test_words.txt";
    private String EMPTY_WORDS_FILE_PATH = "./src/test/resources/empty_words.txt";
    private String FILE_NOT_FOUND_PATH = "./wrong/path/test_words.txt";

    /* Test to check random word printing when file is empty*/
    @Test
    public void testRandomWordWhenFileIsEmpty(){
        randomWord = new RandomWord(EMPTY_WORDS_FILE_PATH);
        Assert.assertEquals("LIST_IS_EMPTY", randomWord.printRandomWord());

    }

    /* Test to check random word printing when file has multiple words*/
    @Test
    public void testRandomWordWhenFileWithWords(){
        randomWord = new RandomWord(TEST_WORDS_FILE_PATH);
        Assert.assertEquals(true , randomWord.printRandomWord().startsWith("a"));
    }

    /* Test to check random word printing when file is not found*/
    @Test
    public void testRandomWordWhenFileNotFound(){
        randomWord = new RandomWord(FILE_NOT_FOUND_PATH);
        Assert.assertEquals(null , randomWord.printRandomWord());
    }
}