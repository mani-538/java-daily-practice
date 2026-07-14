import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number N : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }

        System.out.println("\nSum of Numbers : " + sum);

        sc.close();
    }
}
