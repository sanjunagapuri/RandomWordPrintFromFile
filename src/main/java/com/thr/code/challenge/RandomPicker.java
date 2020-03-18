package com.thr.code.challenge;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.apache.log4j.Logger;
import java.util.List;
import java.util.Random;

/**
 * com.thr.code.challenge.RandomPicker class to pick the random word from a given List of words.
 *
 * @author Sanjay Nagapuri
 *
 */
class RandomPicker {
    private final List<String> list;
    public static final String LIST_IS_EMPTY = "LIST_IS_EMPTY";
    private final static Logger logger = Logger.getLogger(RandomPicker.class);

    public RandomPicker(List<String> list) {
        this.list = list;
    }

  /*Method to Pick the random word from a given list of words */
    public String randomPick() {

        if (list == null || list.isEmpty()) {
        logger.info("Given List is Either Empty Or Null");
            return LIST_IS_EMPTY;
        } else {
            return list.get(pickRandomNumber(list.size()));
        }
    }

    /*Method to randomPick random number between 0 to given max size */
    private int pickRandomNumber(int max) {
        return new Random().nextInt(max);
    }


}
