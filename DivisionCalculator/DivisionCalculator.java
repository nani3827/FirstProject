package DivisionCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {

    private Scanner scanner;

    public DivisionCalculator() {
        this.scanner = new Scanner(System.in);
    }

    public void performDivision() {
        boolean vaildInput = false;

        while (!vaildInput) {
            try {
                System.out.println("Enter the first Integer");
                int num = scanner.nextInt();
                System.out.println("Enter the second Integer");
                int denom = scanner.nextInt();
                int result = num / denom;
                System.out.println(result);
                vaildInput = true;
            } catch (ArithmeticException ae) {
                System.out.println("Error: Division by zero is not allowed. Please try again.");
            } catch (InputMismatchException ie) {
                System.out.println("Error: Invalid input. Please enter valid integers.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        DivisionCalculator calculator = new DivisionCalculator();
        calculator.performDivision();
    }
}
