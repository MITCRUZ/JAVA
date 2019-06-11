import java.util.Scanner;

/**
  *This program shows how the Scanner object can be used to give helpful info.
  *
  *@author Mitchel Santillan
  *@version 6/5/2019
  */
public class AgeStats {
   /**
     *This program outputs basic user info such as max heart rate and age in minutes.
     *
     *@param args Command line arguments (not used).
     */
   public static void main(String[] args) {
      //Creates scanner object
      Scanner stdIn = new Scanner(System.in);
      
      //Utilizes scanner object to extract user info.
      System.out.print("Enter your name: ");
      String name = stdIn.next();
      System.out.print("Enter your age in years: ");
      int ageInYears = stdIn.nextInt();
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      int gender = stdIn.nextInt();
      
      //Calculates info
      double heartResult = maxHeartRate(ageInYears, gender);
      
      //Outputs info based on user input.
      System.out.println("\tYour age in minutes is " 
         + (ageInYears * 525600) + " minutes.");
      System.out.println("\tYour age in centuries is " 
         + (ageInYears / 100.0) + " centuries.");
      System.out.println("Your max heart rate is " + heartResult 
         + " beats per minute.");
   }
   
   public static double maxHeartRate(int age, int gender) {
      if (gender == 1)           return 209 - (0.7 * age);
      else                       return 214 - (0.8 * age);
   }
}