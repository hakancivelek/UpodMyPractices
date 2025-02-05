package ch10.math.calculator4;

public abstract class AbstractMathFunction implements MathFunction {
    protected String name;

    public AbstractMathFunction(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
