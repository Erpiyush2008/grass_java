import java.io.Console;

public class ConsoleExample {

    public static void main(String[] args) {

        // Get console object
        Console con = System.console();

        // Check if console is available
        if (con == null) {
            System.out.println("Console is not available. Please run in terminal.");
            return;
        }

        // Read user input
        String name = con.readLine("Enter your name: ");
        String age = con.readLine("Enter your age: ");

        // Read password securely
        char[] password = con.readPassword("Enter your password: ");

        // Display output using console
        con.printf("\n----- User Details -----\n");
        con.printf("Name: %s\n", name);
        con.printf("Age: %s\n", age);

        // Convert password to String (just for display, not recommended in real apps)
        String passStr = new String(password);
        con.printf("Password: %s\n", passStr);

        // Clear password from memory (security purpose)
        java.util.Arrays.fill(password, ' ');

        con.printf("------------------------\n");
    }
}