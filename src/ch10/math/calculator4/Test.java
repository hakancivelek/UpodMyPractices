package ch10.math.calculator4;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        CalculatorT1 calculator1 = new CalculatorT1(3);
        calculator1.addFunction(new CosFunction());
        calculator1.addFunction(new AverageFunction());
        calculator1.addFunction(new MultiplyFunction());

        startCalculator(calculator1);
    }

    private static void startCalculator(Calculator calculator) {
        while (true) {
            calculator.listMathFunctions();

            System.out.println("Please enter the name of the function:");
            String functionName = in.next();
            in.nextLine();

            if (functionName.equalsIgnoreCase("end")) {
                System.exit(0);
            }

            System.out.println("Enter numbers (separated by spaces):");
            String inputLine = in.nextLine();
            String[] parts = inputLine.split(" ");
            double[] functionArgs = Arrays.stream(parts)
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double result = calculator.doCalculation(functionName, functionArgs);
            System.out.println(functionName + "(" + Arrays.toString(functionArgs) + ")" + ": " + result);
        }
    }
}
