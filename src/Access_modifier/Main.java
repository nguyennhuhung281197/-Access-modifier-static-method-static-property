package Access_modifier;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println("Initial access :" + circle.getArea());

        Circle circle1 = new Circle();

        circle1.setRadius(4);
        System.out.println("Access modifier " + circle1.getArea());
    }
}
