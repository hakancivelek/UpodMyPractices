package ch10.shape;

public class ShapeTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i ++){
            Shape shape = ShapeFactory.produceShape();
            display(shape);
        }
    }

    public static void display(Shape shape){
        shape.draw();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Circumference: " + shape.calculateCircumference());
        System.out.println();
    }
}
