public class TestProgramB {
    public static void main(String[] args) {

        BasicAccount basicAccount = new BasicAccount(100.0);

        System.out.println("Initial Balance: $" + basicAccount.getBalance());

        basicAccount.withdraw(50.0);
        System.out.println("Balance after withdrawing $50: $" + basicAccount.getBalance());

        basicAccount.withdraw(100.0);
        System.out.println("Balance after attempting to withdraw $100: $" + basicAccount.getBalance());

        basicAccount.diposit(50.0);
        System.out.println("Balance after depositing $50: $" + basicAccount.getBalance());


        basicAccount.withdraw(100.0);
        System.out.println("Balance after withdrawing $100: $" + basicAccount.getBalance());
    }
}
