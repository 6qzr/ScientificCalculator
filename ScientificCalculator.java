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
                case "6": break;
                case "7": break;
                case "8": break;
                case "9": break;
                case "10": break;
                case "11": break;
                case "12": break;
                case "13": break;
                case "14": break;
                case "15": break;
                case "16": break;
                case "17": break;
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

    public static double calculateSquareRoot(double num1) {
        return Math.sqrt(num1);
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
        double num1 = scanner.nextDouble();
        if (num1 < 0) {
            System.out.println("Negative Integer!");
        }
        else {
            double result = calculateSquareRoot(num1);
            System.out.println("The square root of "+ num1 + " = "+ result);
        }
        // Implement try-catch for InputMismatchException here!
    }

}
