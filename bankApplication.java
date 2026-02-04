class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

   
    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }


    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

 
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

public class bankApplication {
    public static void main(String[] args) {


        BankAccount acc = new BankAccount(101, "Piyush", 5000);

        acc.display();
        System.out.println("------------------");

        acc.deposit(2000);
        acc.checkBalance();
        System.out.println("------------------");

        acc.withdraw(3000);
        acc.checkBalance();
        System.out.println("------------------");

        acc.withdraw(6000);     }
}

