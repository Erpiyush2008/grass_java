import java.util.Scanner;

interface Operation {
    double apply(int a, int  b);
}
public class CalculatorLambda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

      

        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation mul = (x, y) -> x * y;
        Operation div = (x, y) -> {
            if (y == 0) {
                System.out.println("Error: Division by zero");
                return 0;
            }
            return x / y;
        };

        double result = 0;

        if (op == '+') {
            result = add.apply(8,2);
        } else if (op == '-') {
            result = sub.apply(8, 2);
        } else if (op == '*') {
            result = mul.apply(8, 2);
        } else if (op == '/') {
            result = div.apply(8, 2);
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result = " + result);
    }
}