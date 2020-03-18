package com.thr.code.challenge;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;


/**
 * com.thr.code.challenge.RandomWord class to print the random word from a given wordslist file.
 *
 * @author Sanjay Nagapuri
 *
 */
public class RandomWord {
    private String filePath;
    private final static Logger logger = Logger.getLogger(RandomWord.class);

    public RandomWord(String filePath) {
        this.filePath = filePath;
    }

    /* method to print and return Random word from a given wordslist file */
    public String printRandomWord(){

        String randomWord = null;
            /* Read a file for given file path and convert them into a list of words*/
            FileReader fileReader = new FileReader(filePath);
            try {
                RandomPicker randomPicker = new RandomPicker(fileReader.readFile());
                /* Picks a random word from the List built from file. */
                randomWord = randomPicker.randomPick();

                if (RandomPicker.LIST_IS_EMPTY.equals(randomWord)) {
                    logger.warn("Given File (" + filePath + ") Is Empty");
                    System.out.println("Given File (" + filePath + ") Is Empty");
                } else {
                    logger.info("Printing Random Word from File (" + filePath + ") -->  " + randomWord);
                    System.out.println("Printing Random Word from File (" + filePath + ") -->  " + randomWord);
                }
            } catch(FileNotFoundException fileNotFoundException){
                logger.error("Given File (" + filePath + ") Not Found", fileNotFoundException);
                System.out.println("Given File (" + filePath + ") Not Found");
            }

            return randomWord;
    }

}