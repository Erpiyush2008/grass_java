

import java.io.File;

public class delete_file{
    public static void main(String[] args) {

        // File object
        File file = new File("myfile.txt");

        // Delete file
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}