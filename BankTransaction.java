class BankTransaction extends Thread {  
    private String transactionName;  
  
    BankTransaction(String name) {  
        this.transactionName = name;  
    }  
  
    public void run() {  
        System.out.println(transactionName + " started.");  
        try {  
            Thread.sleep(2000); // Simulate processing time  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println(transactionName + " completed.");  
    }  
  
    public static void main(String[] args) {  
        BankTransaction t1 = new BankTransaction("Deposit");  
        BankTransaction t2 = new BankTransaction("Withdrawal");  
  
        t1.start();  
        t2.start();  
    }  
}    