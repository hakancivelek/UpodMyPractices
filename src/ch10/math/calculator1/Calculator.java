package ch10.math.calculator1;

public interface Calculator {
    void addFunction(MathFunction function);
    void listMathFunctions();
    double doCalculation(String functionName, double arg);
}
