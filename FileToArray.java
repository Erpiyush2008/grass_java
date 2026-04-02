import java.io.*;

public class FileToArray {
    public static void main(String[] args) {

        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                count += parts.length;
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        int[] arr = new int[count];
        int index = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");

                for (String num : parts) {
                    arr[index++] = Integer.parseInt(num);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}