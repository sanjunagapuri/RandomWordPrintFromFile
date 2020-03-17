import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    private String filePath ;
    private List<String> list;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }


    /* Method to read words from a given file and return as a list of Strings*/
    public List<String> readFile() {

        this.list = new ArrayList<String>();
        try {
            Scanner scan = new Scanner(new File(filePath));
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            return list;
        }

        return list;

    }
}
