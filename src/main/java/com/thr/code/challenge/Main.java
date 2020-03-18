package com.thr.code.challenge;

import org.apache.log4j.Logger;

public class Main {

    private final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Started Random Word Print Program");
        long start = System.currentTimeMillis();

        RandomWord randomWord = new RandomWord("./src/main/resources/words_alpha.txt");

        System.out.println("***********OUTPUT START*****************\n");
        randomWord.printRandomWord();
        System.out.println("\n***********OUTPUT END*****************\n");

        long end = System.currentTimeMillis();
        logger.info("Random Word Print Program completed in  : "+(end-start)+"ms");
    }

}
