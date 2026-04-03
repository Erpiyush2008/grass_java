import java.io.*;
import java.util.*;
class User {
    int id;
    String name;
    int age;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class FileHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("users.txt");

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter number of users: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter " + i + " user details:");

                System.out.print("Enter id: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();

                bw.write("ID: " + id + ", Name: " + name + ", Age: " + age);
                bw.newLine();
            }

            bw.close();
            fw.close();

            System.out.println("\n Data written to file successfully!");

            System.out.println("\n Reading Data from File:\n");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}