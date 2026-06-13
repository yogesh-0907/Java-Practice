class BankAccount {

    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.accountHolder = "Yogesh";
        acc.balance = 1000;

        acc.deposit(500);
        acc.withdraw(200);

        acc.displayBalance();
    }
}