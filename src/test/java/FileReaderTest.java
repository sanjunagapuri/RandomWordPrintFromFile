
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class FileReaderTest {
    private FileReader fileReader;
    private String TEST_WORDS_FILE_PATH = "./src/test/resources/test_words.txt";
    private String EMPTY_WORDS_FILE_PATH = "./src/test/resources/empty_words.txt";
    private String FILE_NOT_FOUND_PATH = "./wrong/path/test_words.txt";

    @Test
    void testReadFileWithList() {
        fileReader = new FileReader(TEST_WORDS_FILE_PATH);
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("a");
        expectedList.add("aa");
        expectedList.add("aaa");
        expectedList.add("aah");
        expectedList.add("aahed");

        Assertions.assertEquals( expectedList, fileReader.readFile());
    }

    @Test
    void testReadFileWithEmptyList() {
        fileReader = new FileReader(EMPTY_WORDS_FILE_PATH);
        List<String> expectedList = new ArrayList<String>();

        Assertions.assertEquals( expectedList, fileReader.readFile());
    }

    @Test
    void testReadFileWithFileNotFound() {
        fileReader = new FileReader(FILE_NOT_FOUND_PATH);
        List<String> expectedList = new ArrayList<String>();

        Assertions.assertEquals( expectedList, fileReader.readFile());
    }
}