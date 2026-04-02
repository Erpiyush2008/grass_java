import java.io.*;

public class WriteFile {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("test.txt")) {

            String data = "Hello Piyush\nJava File Handling";

            byte[] bytes = data.getBytes(); // string → bytes
            fos.write(bytes);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}