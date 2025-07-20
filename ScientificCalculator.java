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
                case "1": break;
                case "2": break;
                case "3": break;
                case "4": break;
                case "5": break;
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
                
                Provide operation number: """);


    }

}
