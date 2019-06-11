import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class DigitFormat {
   public static void main(String[] args) {
      //************************************************* Number Format **************************************************************
      NumberFormat percentFmt = NumberFormat.getPercentInstance();
      NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
      Scanner stdIn = new Scanner(System.in);
      
      System.out.print("Enter initial price: ");
      double initialPrice = stdIn.nextDouble();
      
      System.out.print("Enter final price: ");
      double finalPrice = stdIn.nextDouble();
      
      System.out.println("The initial price you entered was: " + currencyFmt.format(initialPrice) + ".");
      System.out.println("The final price you entered was: " + currencyFmt.format(finalPrice) + ".");
      System.out.println("\r\nThere was approximately a " + percentFmt.format((finalPrice - initialPrice) / initialPrice)
         + " change in price. [shown in CurrencyFormat]");
         
      //*********************************************** Decimal Format ***************************************************************
      DecimalFormat df = new DecimalFormat("#.##%");
      System.out.println("\r\nThere was approximately a " + df.format((finalPrice - initialPrice) / initialPrice)
         + " change in price. [shown in CurrencyFormat]");
   }
}  