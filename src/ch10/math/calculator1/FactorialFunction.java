package ch10.math.calculator1;

public class FactorialFunction implements MathFunction {
    private static String name = "Factorial";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return calculateFactorial(arg);
    }

    private double calculateFactorial(double arg) {
        int k = (int) arg;
        int factorial = 1;
        for (int i = 2; i <= k; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
