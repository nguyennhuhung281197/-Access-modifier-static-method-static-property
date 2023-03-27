package Access_modifier;

public class Circle {
    private final double Pi = 3.141592;
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Pi;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
