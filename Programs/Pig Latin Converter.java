/**
  *This program converts the users sentence to pig-latin!
  *
  *@author Mitchel Santillan Cruz
  *@version 3/1/2020
  */
import java.util.Scanner;
public class PigLatin {
  /**
    *Acts as the driver which runs the program and accomplishes its task by using iterators to process letters one by one
    *
    *@param args Command Line Arguments (not used)
    */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String temp = "";       
      System.out.print("Enter a sentence and I'll make it pig-latiny: ");
      String sentence = scan.nextLine();    
      Scanner analyze = new Scanner(sentence);       
      while (analyze.hasNext()) {
         temp += pigLatin(analyze.next()) + " ";
      }      
      System.out.println("Result: " + temp);
   }
   
   /**
     *This method takes in a word and converts it to pig-latin using a few of String and character methods
     *
     *@param input Type String which acts as the word to be converted
     */
   public static String pigLatin(String input) {
      String copy = input.toLowerCase();
      char letter = copy.charAt(0);
      copy = copy.substring(1, copy.length());
      String temp = letter + "ay";
      return copy + temp;      
   }
}
