import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
  *Simple program that demonstrates ability of Scanner class to read input from file.
  *
  *@author Mitchel Santillan
  *@version 6/7/2019
  */
public class Passport {
   /**
     *This driver utilizes a Scanner object to analyze and extract info from text file
     *in order to print out a detailed text of users info.
     *
     *@param args Command line arguments (not used).
     */
   public static void main(String[] args) throws FileNotFoundException {      
      Scanner scan = new Scanner(System.in);
      String file, name = "", nationality = "", gender = "", birthPlace = "";
      int age = 0;
      
      System.out.print("Enter the file name: ");
      file = scan.nextLine();
      Scanner scanFile = new Scanner(new File(file));
      
      while (scanFile.hasNext()) {         
         name = scanFile.nextLine();
         nationality = scanFile.nextLine();
         gender = scanFile.nextLine();
         birthPlace = scanFile.nextLine();
         age = scanFile.nextInt();
      }
      scanFile.close();
      
      System.out.println("Printing passport info...");
      System.out.println("\nPassport\n\tName: " + name + "\n\tNationality: " + nationality
         + "\n\tGender: " + gender + "\n\tPlace of Birth: " + birthPlace + "\n\tAge: " + age);      
   }
}