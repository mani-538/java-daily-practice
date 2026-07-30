public class EmployeeConstructor {

    private String name;
    private double salary;

    public EmployeeConstructor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args) {
        EmployeeConstructor employee1 = new EmployeeConstructor("John Doe", 50000.0);
        EmployeeConstructor employee2 = new EmployeeConstructor("Jane Smith", 60000.0);

        employee1.displayEmployee();
        System.out.println();
        employee2.displayEmployee();
    }
}
