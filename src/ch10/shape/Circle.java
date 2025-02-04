package ch10.shape;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        super("Circle", -1);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawing");
    }

    @Override
    public void erase() {
        System.out.println("Circle erasing");
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
