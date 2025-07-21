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
                case "0": exit = true; System.out.println("\nGoodbye!");
                    scanner.close();
                    break;
                default: System.out.println("Invalid choice. Please select a number from 0 to 17.\n"); break;
            }

        }

    }

    // --- Menu Display Method ---
    public static void displayMenu() {
        System.out.print("""
                ===== Scientific Calculator =====
                
                Basic Operations:
                 1. Addition
                 2. Subtraction
                 3. Multiplication
                 4. Division
                
                Scientific Functions:
                 5. Square Root
                 6. Power (x^y)
                 7. Sine (degrees)
                 8. Cosine (degrees)
                 9. Tangent (degrees)
                10. Natural Logarithm (ln)
                11. Logarithm Base 10 (log10)
                
                Utility Functions:
                12. Absolute Value
                13. Round to Nearest
                14. Ceiling
                15. Floor
                16. Minimum of Two Numbers
                17. Maximum of Two Numbers
                
                0. Exit
                -------------------------------
                Enter your choice:""" + " ");
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

    // --- Scientific Math Methods ---
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

    // --- Utility Math Methods ---
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
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = add(num1, num2);
            System.out.println("The result of " + num1 + " + " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = subtract(num1, num2);
            System.out.println("The result of " + num1 + " - " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = multiply(num1, num2);
            System.out.println("The result of " + num1 + " * " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            if (num2 == 0) {
                System.out.println("Error: Division undefined for division by zero.");
                return;
            }
            double result = divide(num1, num2);
            System.out.println("The result of " + num1 + " / " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter the number: ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                System.out.println("Error: Square root undefined for non-positive numbers.");
                return;
            }
            double result = calculateSquareRoot(number);
            System.out.println("The square root of "+ number + " = "+ result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = calculatePower(num1, num2);
            System.out.println("The result of " + num1 + "^" + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            double result = calculateSine(angle);
            System.out.println("The sine of " + angle + " degrees is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            double result = calculateCosine(angle);
            System.out.println("The cosine of " + angle + " degrees is " + result);
        } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next(); // Clear input buffer
        }
    }

    private static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            if ((angle % 180) == 90) {
                System.out.println("Error: Tangent undefined for " + angle + " degrees.");
                return;
            }
            double result = calculateTangent(angle);
            System.out.println("The tangent of " + angle + " degrees is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performNaturalLogarithm(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                System.out.println("Error: Logarithm undefined for non-positive numbers.");
                return;
            }
            double result = calculateNaturalLogarithm(number);
            System.out.println("The natural log of " + number + " is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performLogBase10(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                System.out.println("Error: Base 10 logarithm undefined for non-positive numbers.");
                return;
            }
            double result = calculateLogarithmBase10(number);
            System.out.println("The base 10 log of " + number + " is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performAbsoluteValue(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            double result = calculateAbsoluteValue(number);
            System.out.println("The absolute value of " + number + " is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performRound(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            long result = roundNumber(number);
            System.out.println(number + " rounded is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performCeiling(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            double result = ceilingNumber(number);
            System.out.println("The ceiling of " + number + " is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performFloor(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            double result = floorNumber(number);
            System.out.println("The floor of " + number + " is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performMin(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = findMin(num1, num2);
            System.out.println("The minimum of " + num1 + " and " + num2 + " is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

    private static void performMax(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = findMax(num1, num2);
            System.out.println("The maximum of " + num1 + " and " + num2 + " is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear input buffer
        }
    }

}
