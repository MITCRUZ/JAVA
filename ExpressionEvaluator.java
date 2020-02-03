import java.util.Scanner;
import java.text.DecimalFormat;
public class ExpressionEvaluator {
   public static void main(String[] args) {
      //Objects
      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      
      //variables    
      String input = "";
      double number = 0;  
      double result = 0;    
      //Receives user input
      System.out.print("Enter a value for x: ");
      input = scan.nextLine(); 
      number = Double.parseDouble(input);
      result = getResult(number);

      
      //Outputs information based on data received.
      System.out.println("Result: " + result);
      System.out.println("# digits to left of decimal point: " + leftCheck(result));
      System.out.println("#digits to right of decimal point: " + rightCheck(result));
      System.out.println("Formatted Result: " + df.format(result));
   }
   
   //The static modifier allows this method to be used across all methods in this class.
   public static double getResult(double numberIn) {
      return (Math.sqrt(Math.abs(23.7 * Math.pow(numberIn, 9)) - numberIn)) 
         / (7.3 *Math.pow(numberIn, 2) + 5.2 * numberIn + 3.1);
   }
   
   public static int leftCheck(double resultIn) {
      String txt = Double.toString(resultIn);
      return txt.indexOf('.');
   }
   
   public static int rightCheck(double resultIn) {
      String txt = Double.toString(resultIn);
      return (txt.length()) - (txt.indexOf('.') + 1);
   }
}
