package com.thr.code.challenge;

import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * com.thr.code.challenge.FileReader class to read the given file and convert the file contents into a List of Strings.
 *
 * @author Sanjay Nagapuri
 *
 */
public class FileReader {

    private final static Logger logger = Logger.getLogger(FileReader.class);

    private String filePath ;
    private List<String> list;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    /* Method to read words from a given file and return as a list of Strings*/
    public List<String> readFile() throws FileNotFoundException {

        this.list = new ArrayList<String>();
        logger.info("Scanning the File from FilePath "+filePath);
            Scanner scan = new Scanner(new File(filePath));
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }

        return list;

    }

}
