package ch10.shape;

public class Rectangle extends Shape {
    private double shortSide;
    private double longSide;
    public Rectangle(double shortSide, double longSide) {
        super("Rectangle", 4);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawing");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle drawing");
    }

    @Override
    public double calculateArea() {
        return shortSide * longSide;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (shortSide + longSide);
    }
}
