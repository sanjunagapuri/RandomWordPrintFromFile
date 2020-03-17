
public class RandomWord {
    private static final String FILE_PATH = "./src/main/resources/words_alpha.txt";

    public static void main(String[] args) {
        /* Read a file for given file path and convert them into a list of words*/
            FileReader fileReader = new FileReader(FILE_PATH);
            RandomPicker randomPicker = new RandomPicker(fileReader.readFile());

        /* Picks a random word from the List built from file. */
            String randomWord = randomPicker.pick();

            if(RandomPicker.LIST_IS_EMPTY.equals(randomWord)){
                System.out.println("Given File ("+FILE_PATH+") Either Not Found Or Is Empty");
            } else {
                System.out.println("Printing Random Word from File ("+FILE_PATH+") -->  " + randomWord);
            }

    }

}