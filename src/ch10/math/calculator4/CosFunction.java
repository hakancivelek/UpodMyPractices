package ch10.math.calculator4;

public class CosFunction extends AbstractMathFunction {
    private static String name = "Cos";

    public CosFunction() {
        super(name);
    }

    @Override
    public double calculate(double[] arg) {
        return Math.cos(arg[0]);
    }
}
