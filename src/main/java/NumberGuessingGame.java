import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Enter a number between 1-100");
// Getting a number from user...
        int guess = input.nextInt();
// Gettin random number from computer
        int number = rnd.nextInt(101);
        while (guess != number) {
            if (guess < 0 || guess > 100) {
                System.out.println("Please enter a number between 1-100: ");
                guess = input.nextInt();
            } else if (guess < number) {
                System.out.println("Enter bigger number: ");
                guess = input.nextInt();
            } else {
                System.out.println("Enter Smaller Number: ");
                guess = input.nextInt();
            }
        }

        System.out.println("You Won..!");
    }
}

