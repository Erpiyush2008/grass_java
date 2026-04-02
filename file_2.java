import java.io.File;
import java.io.IOException;

public class file_2 {
    public static void main(String[] args) {

        try {
            File folder = new File("MyFolder");

            if (folder.mkdir()) {
                System.out.println("Folder created successfully.");
            } else {
                System.out.println("Folder already exists.");
            }

            File file = new File(folder, "myfile2.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error occurred: " + e);
        }
    }
}