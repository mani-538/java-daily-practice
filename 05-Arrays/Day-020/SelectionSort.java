import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }

            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

        }

        System.out.println("\nSorted Array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}