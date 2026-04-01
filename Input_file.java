import java.io.*;

public class Input_file {
    public static void main(String[] args) {

        try {
            InputStreamReader i = new InputStreamReader(
                    new FileInputStream("test.txt")
            );

            int data;
            while ((data = i.read()) != -1) {
                char c = (char) data;
                System.out.print(c);
            }

            i.close();

        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}