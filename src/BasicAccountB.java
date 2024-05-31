public class BasicAccountB extends BankAccount {
    private static final double OVERDRAFT_PENALTY = 30.0;

    public BasicAccountB(double initialBalance) {
        super(initialBalance);
    }

    public BasicAccountB() {
        super();
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Overdraft! Charging penalty of $" + OVERDRAFT_PENALTY);
            super.withdraw(amount + OVERDRAFT_PENALTY);
        } else {
            super.withdraw(amount);
        }
    }
}

