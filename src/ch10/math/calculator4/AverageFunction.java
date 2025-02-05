package ch10.math.calculator4;

public class AverageFunction extends AbstractMathFunction {
    public AverageFunction() {
        super("Average");
    }

    @Override
    public double calculate(double[] args) {
        double sum = 0;
        for (double value : args) {
            sum += value;
        }
        return (sum / args.length);
    }
}
