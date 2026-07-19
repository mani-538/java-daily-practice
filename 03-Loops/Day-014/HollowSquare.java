import java.util.Scanner;

public class HollowSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}