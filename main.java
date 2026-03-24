import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 0) {
                throw new MyException();   
            }
            System.out.println("Valid Age");
        } 
        catch (MyException e) {
            e.printStackTrace();
        } 
        finally {
            System.out.println("This is finally block");
        }
    }
}