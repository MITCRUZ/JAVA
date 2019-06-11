import java.util.Scanner;

/**
  *The purpose of this class is to use common string methods to manipulate
  *string literals.
  *
  *@author Mitchel Santillan
  *@version 6/6/2019
  */
public class MessageConverter {
   /**
     *This program edits a message using several String methods
     *
     *@param args Command Line arguments (not used).
     */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Type in a message and press enter: ");
      System.out.print("\t>");
      String message = scan.nextLine();
      System.out.print("\n\nOutput types:"
         + "\n\t0: As is"
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      int choice = scan.nextInt();
      
      if (choice == 0)           System.out.println("\n\n" + message);
      else if (choice == 1)      System.out.println("\n\n" + message.trim());
      else if (choice == 2)      System.out.println("\n\n" + message.toLowerCase());
      else if (choice == 3)      System.out.println("\n\n" + message.toUpperCase());
      else if (choice == 4) {
         String message2 = message.replace('a', '_');
         message2 = message2.replace('e','_');
         message2 = message2.replace('i','_');
         message2 = message2.replace('o','_');
         message2 = message2.replace('u','_');
         System.out.println(message2);
      }
      else if (choice == 5) {
         String message2 = message.trim();
         System.out.println(message2.substring(1, message2.length() - 1));
      } 
   }
}