import java.util.Scanner;

public class FrequencyOfElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        boolean[] visited = new boolean[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nFrequency of Elements:");

        for (int i = 0; i < numbers.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                    visited[j] = true;
                }

            }

            System.out.println(numbers[i] + " -> " + count);

        }

        sc.close();
    }
}