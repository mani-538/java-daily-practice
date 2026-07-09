import java.util.Scanner;

public class RectangleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rectangle Calculator");
        System.out.println();

        System.out.print("Enter the length : ");
        double length = sc.nextDouble();

        System.out.print("Enter the width : ");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println();

        System.out.println("Area of Rectangle : " + area);
        System.out.println("Perimeter of Rectangle : " + perimeter);

        sc.close();
    }
}
