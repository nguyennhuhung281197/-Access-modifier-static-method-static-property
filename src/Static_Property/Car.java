package Static_Property;

public class Car {

    private String name;
     private String engine;
    public int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
