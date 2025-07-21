import java.util.Scanner;
import java.util.InputMismatchException; // Needed for handling non-numeric input

public class ScientificCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            displayMenu();
            String op = scanner.next();
            switch (op) {
                case "1": performAddition(scanner); break;
                case "2": performSubtraction(scanner); break;
                case "3": performMultiplication(scanner); break;
                case "4": performDivision(scanner); break;
                case "5": performSquareRoot(scanner); break;
                case "6": performPower(scanner); break;
                case "7": performSine(scanner); break;
                case "8": performCosine(scanner); break;
                case "9": performTangent(scanner); break;
                case "10": performNaturalLogarithm(scanner); break;
                case "11": performLogBase10(scanner); break;
                case "12": performAbsoluteValue(scanner); break;
                case "13": performRound(scanner); break;
                case "14": performCeiling(scanner); break;
                case "15": performFloor(scanner); break;
                case "16": performMin(scanner); break;
                case "17": performMax(scanner); break;
                case "18": exit = true; break;
            }

        }

    }

    // --- Menu Display Method ---
    public static void displayMenu() {
        System.out.print("""
                =============================================
                1. Add
                2. Subtract
                3. Multiply
                4. Division
                5. Square Root
                6. Power
                7. Sine
                8. Cosine
                9. Tangent
                10. Natural Logarithm
                11. Base 10 Logarithm
                12. Absolute Value
                13. Round
                14. Ceiling
                15. Floor
                16. Min
                17. Max
                =============================================
                18. EXIT
                
                Provide operation number:""" + " ");


    }

    // --- Basic Arithmetic Methods ---
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double calculatePower(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static double calculateSine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public static double calculateCosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public static double calculateTangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }

    public static double calculateNaturalLogarithm(double number) {
        return Math.log(number);
    }

    public static double calculateLogarithmBase10(double number) {
        return Math.log10(number);
    }

    public static double calculateAbsoluteValue(double number) {
        return Math.abs(number);
    }

    public static long roundNumber(double number) {
        return Math.round(number);
    }

    public static double ceilingNumber(double number) {
        return Math.ceil(number);
    }

    public static double floorNumber(double number) {
        return Math.floor(number);
    }

    public static double findMin(double num1, double num2) {
        return Math.min(num1, num2);
    }

    public static double findMax(double num1, double num2) {
        return Math.max(num1, num2);
    }

    // --- Helper Methods for User Interaction (calling from main's switch-case) ---
    // These methods will get input from the user specifically for each operation
    private static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = add(num1, num2);
        System.out.println("The result of "+ num1 + " + " + num2 + " = "+ result);
        // Implement try-catch for InputMismatchException here!
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = subtract(num1, num2);
        System.out.println("The result of "+ num1 + " - " + num2 + " = "+ result);
        // Implement try-catch for InputMismatchException here!
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = multiply(num1, num2);
        System.out.println("The result of "+ num1 + " * " + num2 + " = "+ result);
        // Implement try-catch for InputMismatchException here!
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
        }
        else {
            double result = divide(num1, num2);
            System.out.println("The result of "+ num1 + " / " + num2 + " = "+ result);
        }
        // Implement try-catch for InputMismatchException here!
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();
        if (number < 0) {
            System.out.println("Negative Integer!");
        }
        else {
            double result = calculateSquareRoot(number);
            System.out.println("The square root of "+ number + " = "+ result);
        }
        // Implement try-catch for InputMismatchException here!
    }

    private static void performPower(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = calculatePower(num1, num2);
        System.out.println("The result of "+ num1 + "^" + num2 + " = "+ result);
        // Implement try-catch for InputMismatchException here!
    }

    private static void performSine(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        double result = calculateSine(angle);
        System.out.println("The sine of " + angle + " degrees is " + result);
    }

    private static void performCosine(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        double result = calculateCosine(angle);
        System.out.println("The cosine of " + angle + " degrees is " + result);
    }

    private static void performTangent(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        double result = calculateTangent(angle);
        System.out.println("The tangent of " + angle + " degrees is " + result);
    }

    private static void performNaturalLogarithm(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double result = calculateNaturalLogarithm(number);
        System.out.println("The natural log of " + number + " is " + result);
    }

    private static void performLogBase10(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double result = calculateLogarithmBase10(number);
        System.out.println("The base 10 log of " + number + " is " + result);
    }

    private static void performAbsoluteValue(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double result = calculateAbsoluteValue(number);
        System.out.println("The absolute value of " + number + " is " + result);
    }

    private static void performRound(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        long result = roundNumber(number);
        System.out.println(number + " rounded is " + result);
    }

    private static void performCeiling(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double result = ceilingNumber(number);
        System.out.println("The ceiling of " + number + " is " + result);
    }

    private static void performFloor(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double result = floorNumber(number);
        System.out.println("The floor of " + number + " is " + result);
    }

    private static void performMin(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = findMin(num1, num2);
        System.out.println("The minimum of " + num1 + " and " + num2 + " is " + result);
    }

    private static void performMax(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = findMax(num1, num2);
        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + result);
    }

}
