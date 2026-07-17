import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        int product = 1;
        int original = number;

        while (number != 0) {
            int digit = number % 10;
            product = product * digit;
            number = number / 10;
        }

        System.out.println("Original Number : " + original);
        System.out.println("Product of Digits : " + product);

        sc.close();
    }
}
