import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] original = new int[5];
        int[] copy = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < original.length; i++) {
            original[i] = sc.nextInt();
        }

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("\nCopied Array:");

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

        sc.close();
    }
}