package InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputValidator {
    private Scanner scanner;
    public AgeInputValidator() {
        this.scanner = new Scanner(System.in);
    }

    public int getValidAge() {
        int age = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter your age (1-120): ");
            try {
                age = scanner.nextInt();
                if (age >= 1 && age <= 120) {
                    validInput = true;
                } else {
                    System.out.println("Invalid age. Please enter a number between 1 and 120.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
        return age;
    }

    public static void main(String[] args) {
        AgeInputValidator validator = new AgeInputValidator();
        int age = validator.getValidAge();
        System.out.println("Your valid age is: " + age);
    }

}
