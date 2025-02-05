package ch10.math.calculator4;

public class MultiplyFunction extends AbstractMathFunction {
    public MultiplyFunction() {
        super("Multiply");
    }

    @Override
    public double calculate(double[] arg) {
        return (arg[0] * arg[1]);
    }
}
