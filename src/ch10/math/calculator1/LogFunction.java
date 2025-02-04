package ch10.math.calculator1;

public class LogFunction implements MathFunction{
    private static String name = "Log";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.log(arg);
    }
}
