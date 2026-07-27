import java.util.Scanner;

public class CalculatorMethod {

    public static int add(int a, int b) {

        return a + b;

    }

    public static int subtract(int a, int b) {

        return a - b;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition = " + add(num1, num2));
        System.out.println("Subtraction = " + subtract(num1, num2));

        sc.close();
    }
}