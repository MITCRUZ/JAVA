import java.util.Random;

/**
  *This prgram shos how o use both the Random class and the Math class to
  *generate pseudorandom numbers.
  * 
  *@author Mitchel Santillan
  *@version 6/5/2019
  */
public class NumberGenerator {
   /**
     *Use two classes to print pseudorandom numbers.
     *
     *@param args Command Line arguments (not used).
     */
   public static void main(String[] args) {
      //************************************************ Random Class ***********************************************************
      Random rand = new Random();
      
      //Prints randm number within given range: [0,4]
      System.out.println(rand.nextInt(5));
      
      //Prints random number within given range: [-93,1]
      System.out.println(rand.nextInt(95) - 93);
      
      //Prints random number within given range: [23, 29]
      System.out.println(rand.nextInt(7) + 23);
      
      //Prints random number within given range: [2, 10]
      System.out.println((int) (rand.nextDouble() * 9) + 2);
      
      //************************************************ Math Class **************************************************************
      //Prints randm number within given range: [0,4]
      System.out.println((int) (Math.random() * 5) + 0);
      
      //Prints random number within given range: [-93,1]
      System.out.println((int) (Math.random() * -93) + 1);
      
      //Prints random number within given range: [23, 29]
      System.out.println((int) (Math.random() * 7) + 23);
      
      //Prints random number within given range: [2, 10]
      System.out.println((int) (Math.random() * -7) + 10);
   }
   /*
    *Notes: By printing pseudorandom numbers using two different classes, I realized that the nextDouble method found in the Random class
    *operates in the same way the random method works in the Math class.     
    */
}