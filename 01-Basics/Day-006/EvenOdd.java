import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Given Number is an Even");
        } else {
            System.out.println("Given Number is an Odd");
        }

        sc.close();

    }
}
