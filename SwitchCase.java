import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("=====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 Numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.nextLine(); // buffer clear

        System.out.println("Enter Option in Words");
        String option = sc.nextLine();
        option = option.toUpperCase(); // add, Add → ADD

        switch (option) {

            case "ADD":
                System.out.println("Sum is " + (x + y));
                break;

            case "SUB":
                System.out.println("Difference is " + (x - y));
                break;

            case "MUL":
                System.out.println("Product is " + (x * y));
                break;

            case "DIV":
                if (y != 0)
                    System.out.println("Ratio is " + (x / y));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid Option");
        }

        sc.close();
    }
}
