public class BankAccount {
    private double balance;

    public void deposite(double amount){
        if( amount > 0 )
            balance+=amount;
    }
    public void withdraw(double amount){
        if( amount <= balance )
            balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String args[]){
        BankAccount account = new BankAccount();
        account.deposite(5000);
        account.withdraw(3000);
        System.out.println("Balance : "+account.getBalance());
    }
}
