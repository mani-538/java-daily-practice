import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance : ");
        double balance = sc.nextDouble();

        System.out.println("\nChoose Operation");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter a choice : ");
        byte choice = sc.nextByte();

        switch (choice) {
            case 1:
                System.out.println("Balance : " + balance);
                break;
            case 2:
                System.out.print("Enter Amount : ");
                double amount = sc.nextDouble();
                System.out.println("Amount Deposited \nBalance : " + (balance + amount));
                break;
            case 3:
                System.out.print("Enter Amount : ");
                amount = sc.nextDouble();
                System.out.println("Amount Withdrawed \nBalance : " + (balance - amount));
                break;
            case 4:
                System.out.println("Exiting Process \nCollect Your Card ");
                break;

            default:
                System.out.println("Invalid Choice !!");
                break;
        }

        sc.close();
    }
}
