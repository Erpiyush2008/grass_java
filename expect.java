import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class expect {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Throw custom exception
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative");
            }

            System.out.println("Valid Age: " + age);

        } 
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General Exception: " + e);
        } 
        finally {
            System.out.println("Finally block executed");
            sc.close();
        }
    }
}