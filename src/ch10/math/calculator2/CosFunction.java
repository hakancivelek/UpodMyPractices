package ch10.math.calculator2;

public class CosFunction extends AbstractMathFunction {
    private static String name = "Cos";

    public CosFunction() {
        super("Cos");
    }

    @Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
}
