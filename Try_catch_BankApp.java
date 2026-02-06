class Try_catch_BankApp {

    static void withdraw(int balance, int amount) {

        try {
            if (amount > balance) {
                // manually throwing exception
                throw new ArithmeticException("Insufficient Balance");
            }
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        int balance = 5000;
        int withdrawAmount = 7000;

        withdraw(balance, withdrawAmount);

        System.out.println("Program ended safely");
    }
}
