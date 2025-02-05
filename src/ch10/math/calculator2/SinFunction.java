package ch10.math.calculator2;

public class SinFunction extends AbstractMathFunction {

    public SinFunction() {
        super("Sin");
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
}
