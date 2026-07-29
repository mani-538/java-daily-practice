public class Student {

    String name;
    int age;

    public void displayDetails() {

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);

    }

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Mani";
        student1.age = 18;

        student1.displayDetails();

    }
}