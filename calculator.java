package test;
import java.util.Scanner;

public class Im {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter a number");
        double firstNumber = scanner.nextDouble();
        System.out.println("enter second number");
        double secondNumber = scanner.nextDouble();
        
        double sum = firstNumber + secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        double power = Math.pow(firstNumber, secondNumber);
        double result = logBaseY(firstNumber, secondNumber);

        System.out.printf("log base %f of %f is %f%n", secondNumber, firstNumber, result);
        System.out.printf("The sum of the two numbers is: %f %n", sum);
        System.out.printf("The product of the two numbers is: %f %n", product);
        System.out.printf("The quotient of the two numbers is: %f %n", quotient);
        System.out.printf("The first number to the power of the second number is: %f %n", power);
        
        scanner.close();
    }

    public static double logBaseY(double num, double base) {
        return Math.log(num) / Math.log(base);
    }
}
