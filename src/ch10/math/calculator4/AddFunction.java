package ch10.math.calculator4;

public class AddFunction extends AbstractMathFunction{

    public AddFunction() {
        super("Add");
    }

    @Override
    public double calculate(double[] arg) {
        return (arg[0] + arg[1]);
    }
}
