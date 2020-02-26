/**
  *Shows the basic use of arrays
  *
  *@author Mitchel Santillan
  *@version 2/25/2020
  */
import java.util.Scanner;
public class InsertElementInArray {
   //Global Area
   
   //Sets the array length 
   static int[] arr = new int[10];
   
   //Describes the slots remaining in the array
   static int slotsRemaining = arr.length;
   
   //Describes the amount of insertions made
   static int inserts = 0;
   
   //Tells us whether the array is full or not
   static boolean notFull = true;
   
   /**
     *Allows the user to insert elements into an array and view its details
     *such as insertions made and current state of the array
     *
     *@param args Command Line Arguments (not used).
     */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String response = "";            
      do {      
         System.out.println(slotsRemaining + " slots available.");
         System.out.print("What number do you wish to add: ");
         int input = scan.nextInt();
         System.out.print("At what index do you want to add it? ");
         int idx = scan.nextInt();
         //Runs insert method         
         System.out.println(insert(arr, input, idx));    
         System.out.print("Do you wish to see the current state of the array? ");
         response = scan.next();
         if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            printArray();
         }     
      } while (notFull); 
      System.out.println("The array is now full...");                            
   }
   
   //Inserts the element in the array if possible
   public static String insert(int[] arrIn, int numIn, int idxIn) {
      if ((idxIn > arrIn.length - 1) || (idxIn < 0)) {
         String output = "Invalid index.";
         return output;
      }
      if (arrIn[idxIn] != 0) {
         String output = "This slot is taken.";
         return output;
      }
      else {
         arrIn[idxIn] = numIn;
         slotsRemaining--;         
         if (++inserts == 2)       notFull = false;         
         String output = slotsRemaining + " slots remaining.";         
         return output;
      }
   }
   
   //Prints the current state of the array
   public static void printArray() {
      for (int i = 0; i < arr.length; i++) {
         if (i == arr.length - 1)           System.out.println(arr[i]);
         else                                System.out.print(arr[i] + ", ");
      }
   }      
}
