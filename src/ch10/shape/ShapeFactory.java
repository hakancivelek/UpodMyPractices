package ch10.shape;

public class ShapeFactory {
    public static Shape produceShape() {
        Shape shape = null;
        int randomNumber = (int) (3 + Math.random() * 4);
        switch (randomNumber) {
            case 3:
                shape = new Circle(randomNumber);
                break;
            case 4:
                shape = new Rectangle(3 * randomNumber, 5 * randomNumber);
                break;
            case 5:
                shape = new Square(4 * randomNumber);
                break;
            case 6:
                shape = new Triangle(2 * randomNumber, 4 * randomNumber);
                break;
        }
        return shape;
    }
}
