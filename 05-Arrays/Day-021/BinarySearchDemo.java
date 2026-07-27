import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(numbers, key);

        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}