package ch10.math.calculator4;

public class CalculatorT1 implements Calculator {
    private MathFunction[] functions;
    private int currentFunctionCount = 0;

    public CalculatorT1(int functionCount) {
        functions = new MathFunction[functionCount];
    }

    @Override
    public void addFunction(MathFunction function) {
        functions[currentFunctionCount] = function;
        currentFunctionCount++;
    }

    @Override
    public void listMathFunctions() {
        for (MathFunction function : functions) {
            System.out.println(function.getName());
        }
    }

    @Override
    public double doCalculation(String functionName, double[] arg) {
        double result = 0;
        boolean isFunctionFound = false;

        for (MathFunction function : functions) {
            if (functionName.equalsIgnoreCase(function.getName())) {
                result = function.calculate(arg);
                isFunctionFound = true;
                break;
            }
        }
        if (!isFunctionFound) {
            System.out.println("No such function found!");
        }
        return result;
    }
}
