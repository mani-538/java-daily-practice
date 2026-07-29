public class Employee {
    public void displayEmployeeDetails(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.displayEmployeeDetails("John", 30);
    }
}
