import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println(number + " is a Positive Number.");
        } else {
            System.out.println(number + " is a Negative Number.");
        }

        sc.close();
    }
}