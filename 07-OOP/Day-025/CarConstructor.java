public class CarConstructor {

    String brand;
    String color;

    // Parameterized Constructor
    public CarConstructor(String brand, String color) {

        this.brand = brand;
        this.color = color;

    }

    public void displayCar() {

        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);

    }

    public static void main(String[] args) {

        CarConstructor car1 = new CarConstructor("Toyota", "White");
        CarConstructor car2 = new CarConstructor("Honda", "Black");

        car1.displayCar();

        System.out.println();

        car2.displayCar();

    }
}