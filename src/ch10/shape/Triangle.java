package ch10.shape;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height) {
        super("Triangle", 3);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Triangle drawing");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erasing");
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculateCircumference() {
        double otherSide = Math.sqrt(Math.pow(height, 2) - Math.pow(base, 2));
        return base + height + otherSide;
    }
}
