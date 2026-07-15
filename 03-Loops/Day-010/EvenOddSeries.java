import java.util.Scanner;

public class EvenOddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();

        System.out.println("Odd Numbers :");
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }

        System.out.println("Even Numbers :");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}
