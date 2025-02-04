package ch10.math.calculator2;

public class SquaredFunction extends AbstractMathFunction {

    public SquaredFunction() {
        super("Squared");
    }

    @Override
    public double calculate(double arg1) {
        return Math.sqrt(arg1);
    }
}
