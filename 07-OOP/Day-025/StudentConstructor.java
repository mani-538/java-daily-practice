public class StudentConstructor {

    String name;
    int age;

    // Default Constructor
    public StudentConstructor() {

        name = "Unknown";
        age = 18;

    }

    public void displayDetails() {

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);

    }

    public static void main(String[] args) {

        StudentConstructor student = new StudentConstructor();

        student.displayDetails();

    }
}