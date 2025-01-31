package ex1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea() + ". The color is " + c1.getColor() + ".");

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea() + ". The color is " + c2.getColor() + ".");

        Circle c3 = new Circle(3.0, "blue");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + ". The color is " + c3.getColor() + ".");

        Circle c4 = new Circle();
        c4.setRadius(5.5); // Change radius
        System.out.println("Radius is: " + c4.getRadius()); // Print new radius
        c4.setColor("green"); // Change color
        System.out.println("Color is: " + c4.getColor()); // Print new color
    }
}
