import java.text.DecimalFormat;
import java.util.Scanner;

/**
  *The purpose fr this program is get better manipulate strings to 
  *extract valuable info.
  * 
  *@author Mitchel Santillan
  *@version 6/6/2019
  */
public class MoonTrip {
   /** 
     *Creates a ticket to the moon with special info.
     *
     *@param args Command line arguments (not used).
     */
     
   static final double STUDENT_DISCOUNT = 0.4;
   static final double EMPLOYEE_DISCOUNT = 0.2;
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      System.out.print("Enter ticket code: ");
      String info = scan.nextLine();
      if (info.length() <= 25) {
         System.out.println("\n\n*** Invalid ticket code ***"
            + "\nTicket code must have at least 26 characters.");
      } else {
         double price = Double.parseDouble(info.substring(13,20));
         char category = info.charAt(12);
         double cost;
         if (category == 's') {
            cost = price - (price * STUDENT_DISCOUNT);
         } else if (category == 'e') {
            cost = price - (price * EMPLOYEE_DISCOUNT);
         } else {
            cost = price;
         }    
         
         System.out.println("\nDate: " + info.substring(0, 2) + "/" + info.substring(2, 4)
            + "/" + info.substring(4, 8) + "   Time: " + info.substring(8, 10)
            + ":" + info.substring(10, 12) + "   Seat: " + info.substring(22, 25)
            + "\nItinerary: " + info.substring(25, info.length()) 
            + "\nPrice: " + df.format(price) + "   Category: " + info.substring(12, 13)
            + "   Cost: " + df.format(cost) + "\nPrize Number: "
            + ((int) (Math.random() * 9999) + 1));
      }            
   }
}