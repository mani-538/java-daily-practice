import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        long roll_number = sc.nextLong();

        System.out.print("Enter 1st Mark : ");
        double mark_1 = sc.nextDouble();

        System.out.print("Enter 2nd Mark : ");
        double mark_2 = sc.nextDouble();

        System.out.print("Enter 3rd Mark : ");
        double mark_3 = sc.nextDouble();

        double total_marks = mark_1 + mark_2 + mark_3;
        double average_marks = total_marks / 3;

        System.out.println("\n_________________");

        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll_number);
        System.out.println("Total Marks : " + total_marks);
        System.out.println("Average Marks : " + average_marks);

        sc.close();
    }

}
