import java.io.*;

public class image_copy {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("pi.jpeg");
            FileOutputStream fos = new FileOutputStream("output.jpg");

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("Image copied successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}