/**
  *This program takes in a sentence and converts it to pig-latin.
  *However, if it finds a numemric somewhere in the sentence then 
  *it will tell you to try again without a numeric value.
  *
  *@Author Mitchel Santillan cruz
  *@Version 3/2/2020
  */   
import java.util.Scanner;
public class PigLatin {
   /**
     *This method acts as the driver which takes care of receiving the user input and calling the methods.
     *
     *Time Complexity: o(n^2)
     *
     *@param args Command Line Arguments (not used).
     */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);                   
      System.out.print("Enter a sentence and I'll make it pig-latiny: ");
      String sentence = scan.nextLine();            
      System.out.println("Result: " + convertSentence(sentence));                                        
   }
     
   /**
     *This method checks if the input is a string by processing each item one by one (Iterator).
     *
     *Time Complexity: o(n^2)
     *
     *@param input Value of Type String
     */  
   public static void checkIfString(String input) {  
      Scanner scan = new Scanner(input);
      while (scan.hasNext()) {
         try {
            checkForNumbers(scan.next());            
         } catch (NumberFormatException e) {
            //Nothing happens here...           
         }
      }    
   }   
   
   /**
     *This method checks each individual word for any numeric values,
     *if it finds them then the program halts.
     *
     *Time Complexity: o(n)
     *
     *@param input Value type String
     */
   public static void checkForNumbers(String input) {
      for (char i : input.toCharArray()) {         
         if (Character.isDigit(i)) {
            System.out.println("Invalid input, try again with non-numeric values.");
            System.exit(0);
         }
      }
   }
   
   /**
     *This method takes care of converting each individual word to pig-latin.
     *
     *Time Complexity: o(1)
     *     
     *@param input Value Type String
     */
   public static String pigLatin(String input) {
      String copy = input.toLowerCase();
      char letter = copy.charAt(0);
      copy = copy.substring(1, copy.length());
      String temp = letter + "ay";
      return copy + temp;      
   }
   
   /**
     *This method converts the sentence into pig-latin.
     *
     *Time Complexity: o(n^2)
     *
     *@param input Value Type String
     */
   public static String convertSentence(String input) {
      String temp = "";
      checkIfString(input);                                         
      Scanner analyze = new Scanner(input);       
      while (analyze.hasNext()) {                        
         temp += pigLatin(analyze.next()) + " ";
      }
      return temp;
   }
}
