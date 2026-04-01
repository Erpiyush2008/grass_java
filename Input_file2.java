import java.io.*;

public class Input_file2 {
    public static void main(String[] args) {

        try (
            FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
        ) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}