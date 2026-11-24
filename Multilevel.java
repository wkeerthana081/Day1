class Account {
    int accountNumber;
    void showAccount() {
        System.out.println("Account Number: " + accountNumber);
    }
}
class SavingsAccount extends Account {
    double interestRate;
    void showSavingsDetails() {
        System.out.println("Interest Rate: " + interestRate);
    }
}
class FixedDepositAccount extends SavingsAccount {
    int lockInYears;
    void showFDDetails() {
        System.out.println("Lock In Years: " + lockInYears);
    }
}
class Main {
    public static void main(String[] args) {
        FixedDepositAccount f = new FixedDepositAccount();
        f.accountNumber = 101;
        f.interestRate = 5.5;
        f.lockInYears = 3;
        f.showAccount();
        f.showSavingsDetails();
        f.showFDDetails();
    }
}