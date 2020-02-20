/**
  *Demonstrates how to remove and add elements into an array.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/11/2020
  */
import java.util.Scanner;
import java.util.ArrayList;
public class Sandbox {
   /**
     *Asks the user to enter the index of the array they wish to remove and performs the deletion
     *It does not however get user input when elements are inserted into our array.
     *
     *@param args Command Line Arguments (not used).
     */
   public static void main(String[] args) {      
      Scanner scan = new Scanner(System.in);
      int index = 0;
      double result = 0;
      //Establishes our array
      int elements = 0;
      int[] arr = new int[5]; 
      
      //adds 3 elements into the array
      for (int i = 0; i < 3; i++) {
         arr[i] = i + 1;
         elements++;
      } 
      
      System.out.println("Printing the elements of the array...\n");
      for (int i = 0; i < elements; i++) {
         System.out.print(arr[i] + " ");         
      }
      System.out.println("\nDone");    
      
      //Demonstrates how to remove an element from the array given any index.
      System.out.print("Your array has a length of: " + arr.length
         + "\nAt what index do you wish to remove an element? ");
      index = scan.nextInt();
      
      for (int i = index; index < elements - 1; index++) {
         arr[index] = arr[index + 1];         
      }
      arr[elements] = 0;
      elements--;
      
      System.out.println("Printing the elements of the array...\n");
      for (int i = 0; i < elements; i++) {
         System.out.print(arr[i] + " ");         
      }
      System.out.println("\nDone");    
      
      System.out.println("The average of the elements in the array is " + find_avg(elements, arr));                       
   }  
   
   public static double find_avg(int elementsIn, int ... arrIn) {      
      double result = 0;
      for (int i = 0; i < elementsIn; i++) {
         result += arrIn[i];
      }
      if (arrIn.length != 0)                return result / elementsIn; 
      else                                return 0;      
   }
}
