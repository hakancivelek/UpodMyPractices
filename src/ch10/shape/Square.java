package ch10.shape;
public class Square extends Shape{
    private double side;
    public Square(double side) {
        super("Square", 4);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square drawing");
    }

    @Override
    public void erase() {
        System.out.println("Square erasing");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculateCircumference() {
        return 4 * side;
    }
}
