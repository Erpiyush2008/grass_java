import java.io.*;

public class try_with_resource {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("data.txt"));
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
