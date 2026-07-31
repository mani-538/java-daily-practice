public class Employee {
    private String employeeName;
    private double salary;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {

        if (salary > 0) {
            this.salary = salary;
        }

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmployeeName("Mani");

        employee.setSalary(50000);

        System.out.println("Employee Name : " + employee.getEmployeeName());

        System.out.println("Salary : ₹" + employee.getSalary());

    }
}
