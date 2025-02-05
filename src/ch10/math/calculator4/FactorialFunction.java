package ch10.math.calculator4;

public class FactorialFunction extends AbstractMathFunction {

    public FactorialFunction() {
        super("Factorial");
    }

    @Override
    public double calculate(double[] arg) {
        return calculateFactorial(arg[0]);
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
