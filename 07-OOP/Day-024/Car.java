public class Car {

    String brand;
    String color;

    public void showCar() {

        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);

    }

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.color = "White";

        car1.showCar();

    }
}