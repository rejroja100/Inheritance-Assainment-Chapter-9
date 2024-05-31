public class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void diposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
