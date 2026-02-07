package test;
import java.util.Scanner;

public class Im {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

           System.out.print("How old are you?");

          int d = scanner.nextInt();

           int s = d + 5;
           
           System.out.println("In 5 years you will be " + s + " years old.");
           System.out.printf("It is " + ((d < 20) && (d > 12)) +" that you are a teenager %n5");

           System.out.println("I am such a smart computer.");

         
    }
}
