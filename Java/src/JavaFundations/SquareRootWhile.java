package JavaFundations;
import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
   
     Scanner console = new Scanner(System.in);
     int number = -1;
     while (number < 0) {
         System.out.print("Type a non-negative integer: ");
         number = console.nextInt();
     }

     double squareRoot = Math.sqrt(number);
     System.out.println("Square root of " + number + " is " + squareRoot);
 }
}