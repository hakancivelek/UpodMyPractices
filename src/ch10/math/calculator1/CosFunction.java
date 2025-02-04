package ch10.math.calculator1;

public class CosFunction implements MathFunction{
    @Override
    public String getName() {
        return "Cos";
    }

    @Override
    public double calculate(double value) {
        return Math.cos(value);
    }
}
