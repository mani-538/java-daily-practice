import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < numbers.length; i++) {

            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {

                numbers[j + 1] = numbers[j];
                j--;

            }

            numbers[j + 1] = key;

        }

        System.out.println("\nSorted Array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}