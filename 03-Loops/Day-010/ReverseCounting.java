import java.util.Scanner;

public class ReverseCounting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\nReverse Counting:");

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}