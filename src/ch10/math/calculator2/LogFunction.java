package ch10.math.calculator2;

public class LogFunction extends AbstractMathFunction {

    public LogFunction() {
        super("Log");
    }

    @Override
    public double calculate(double arg) {
        return Math.log(arg);
    }
}
