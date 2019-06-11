import java.util.Scanner;
import java.text.DecimalFormat;

/**
  *This prgram requires a combination of the Scanner as wel as the 
  *DecimalFormat class.
  *
  *@author Mitchel Santillan
  *@version 6/6/2019
  */
public class ExpressionEvaluator {
   /**
     *This program will calculate facts about numbers given by the user.
     *
     *@param args Command line arguments (not used).
     */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.0####");
   
      System.out.print("Enter a value for x: ");
      double num = scan.nextDouble();
      double result = evaluator(num);
      System.out.println("Result: " + result);
      
      String sResult = Double.toString(result);
      int numLeft = sResult.indexOf('.');
      int numRight = sResult.length() - (numLeft + 1);
      
      System.out.println("# digits to left of decimal point: " + numLeft);
      System.out.println("# digits to right of decimal point: " + numRight);
      System.out.println("Formatted Result: " + df.format(result));
   }   
   
   public static double evaluator(double num) {
      return (Math.sqrt(Math.abs(23.7 * Math.pow(num, 9)) - num)) 
         / (7.3 * num * num + 5.2 * num + 3.1);
   }
}