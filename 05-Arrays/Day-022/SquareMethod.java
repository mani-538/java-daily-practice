import java.util.Scanner;

public class SquareMethod {

    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square of " + num + " is " + square(num));
        sc.close();
    }

}