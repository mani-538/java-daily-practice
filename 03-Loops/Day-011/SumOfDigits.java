import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        int original = number;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("Original Number : " + original);
        System.out.println("Sum of Number : " + sum);

        sc.close();

    }
}
