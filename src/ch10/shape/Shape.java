package ch10.shape;

public abstract class Shape implements Drawable, Erasable {
    private String name;
    private int numberOfSides;

    public Shape(String name, int numberOfSides){
        this.name = name;
        this.numberOfSides = numberOfSides;
    }

    public abstract double calculateArea();

    public abstract double calculateCircumference();
}
