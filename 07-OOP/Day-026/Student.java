public class Student {

    private String name;
    private int age;

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        }

    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Mani");
        student.setAge(18);

        System.out.println("Name : " + student.getName());
        System.out.println("Age  : " + student.getAge());

    }
}