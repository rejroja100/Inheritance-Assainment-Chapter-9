public class BasicAccount extends BankAccount {

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    public BasicAccount() {
        super();
    }


    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            super.withdraw(amount);
        }
    }
}

