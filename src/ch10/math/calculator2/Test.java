package ch10.math.calculator2;

import java.util.Scanner;

public class Test {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        CalculatorT1 calculator1 = new CalculatorT1(2);
        calculator1.addFunction(new SinFunction());
        calculator1.addFunction(new CosFunction());

//        calculator1.listFunction();

        CalculatorT1 calculator2 = new CalculatorT1(3);
        calculator2.addFunction(new LogFunction());
        calculator2.addFunction(new FactorialFunction());
        calculator2.addFunction(new SquaredFunction());

        startCalculator(calculator2);
    }

    private static void startCalculator(Calculator calculator) {
        while (true) {
            calculator.listMathFunctions();

            System.out.println("Please enter the name of the function:");
            String functionName = in.next();
            if (functionName.equalsIgnoreCase("end")) {
                System.exit(0);
            }
            System.out.println("Please enter the argument of the function:");

            double functionArg = in.nextDouble();
            double result = calculator.doCalculation(functionName, functionArg);
            System.out.println(functionName + "(" + functionArg + ")" + ": " + result);
        }
    }
}
