public class BankAccount {

    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Mani");

        account.deposit(5000);

        account.deposit(2500);

        System.out.println("Account Holder : " + account.getAccountHolder());

        System.out.println("Balance : ₹" + account.getBalance());

    }
}