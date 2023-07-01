import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {


    public static List<String> fileReadHandler(String filePath) {
        List<String> lines = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(filePath));
            while ((sc.hasNextLine())) {
                lines.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found!");
        }
        return lines;
    }


}
