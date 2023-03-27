package Static_Property;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mazda 3","Skyactiv 3");
        System.out.println(car.numberOfCars);

        Car car1 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(car1.numberOfCars);
    }
}
