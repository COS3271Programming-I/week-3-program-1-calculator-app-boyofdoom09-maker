package test;
import java.util.Scanner;

public class Im {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first binary number (x): ");
        String x = scanner.nextLine();
        System.out.print("Enter second binary number (y): ");
        String y = scanner.nextLine();
        
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        
        System.out.println("x + y = " + Integer.toBinaryString(sum));
        System.out.println("x - y = " + Integer.toBinaryString(difference));
        System.out.println("x * y = " + Integer.toBinaryString(product));
        System.out.println("x / y = " + Integer.toBinaryString(quotient));
        
        scanner.close();

         
    }
}
