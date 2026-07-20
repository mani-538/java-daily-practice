import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        do {
            System.out.println("Enter Password:");
            password = sc.nextLine();

            if (!password.equals("java123")) {
                System.out.println("\nWrong Password!\n");
            }

        } while (!password.equals("java123"));

        System.out.println("Access Granted!");

        sc.close();
    }
}