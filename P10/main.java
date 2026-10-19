class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getName() {
        return name;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount a = new BankAccount("Rahul", "12345", 10000);

        System.out.println("Account Holder: " + a.getName());
        System.out.println("Account Number: " + a.getAccountNumber());
        System.out.println("Balance: " + a.getBalance());

        System.out.println();

        a.deposit(2000);
        a.deposit(-500);

        a.withdraw(3000);
        a.withdraw(0);
        a.withdraw(-100);
        a.withdraw(20000);

        System.out.println("\nUpdated Balance: " + a.getBalance());
    }
}
