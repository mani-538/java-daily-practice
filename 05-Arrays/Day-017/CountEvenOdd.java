import java.util.Scanner;

public class CountEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        int even = 0;
        int odd = 0;

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println("Even Numbers = " + even);
        System.out.println("Odd Numbers = " + odd);

        sc.close();
    }
}