import java.io.*;

public class WriteFile2 {
    public static void main(String[] args) {

        try (
            FileOutputStream fos = new FileOutputStream("test.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
        ) {

            bw.write("Hi this is demo file");
            bw.newLine();
            bw.write("Second line using OutputStream");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}