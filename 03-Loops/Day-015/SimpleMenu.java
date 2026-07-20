import java.util.Scanner;

public class SimpleMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Say Hello");
            System.out.println("2. Show Java Version");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Hello, Welcome to Java!");
                    break;

                case 2:
                    System.out.println("Java Programming Practice");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 3);

        sc.close();
    }
}