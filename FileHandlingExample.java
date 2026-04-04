import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {

        try {
            // 1. File create
            File file = new File("sample.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write into file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is Java File Handling Example.\n");
            writer.write("Learning file handling is easy!");
            writer.close();
            System.out.println("Data written successfully.");

            // 3. Read file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("\nReading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error occurred: " + e);
        }
    }
}