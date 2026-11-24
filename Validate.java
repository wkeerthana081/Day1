class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public void setBalance(double amount) {
        if(amount >= 0) {
            balance = amount;
        }
        else {
            System.out.println("Invalid balance");
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}
public class Validate {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountHolder("Rahul");
        b.setBalance(5000);

        b.deposit(1000);
        b.withdraw(2000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Balance: " + b.getBalance());
    }
}