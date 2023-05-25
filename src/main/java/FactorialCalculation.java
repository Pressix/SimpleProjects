import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number:");

        int num = reader.nextInt();
        int counter = num;
        long factorial = 1;

        //    while (counter > 1) {
        //        factorial *= counter;
        //        counter--;

        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.print("Factorial of " + num + " = " + factorial);
    }
}

