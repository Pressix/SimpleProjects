import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Calculator Project For Core-Java Learner");
        System.out.println("------------------");
        System.out.println("Addition: +");
        System.out.println("Subtraction: -");
        System.out.println("multiplication: *");
        System.out.println("Division: /");
        System.out.println("------------------");

        System.out.print("Select one of the operations in parentheses ==> (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("First Number: ");
        double num1 = input.nextDouble();

        System.out.print("Second Number: ");
        double num2 = input.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("You have selected an invalid operation.");
        }

        System.out.println("Result: " + result);

        input.close();
    }
}

