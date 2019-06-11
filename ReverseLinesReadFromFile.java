import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/**
  *This class shows how to use Scanner class to read a 
  *text file and extract its info.
  *
  *@author Mitchel Santillan
  *@version 6/6/2019
  */
public class ReverseLinesReadFromFile {
   /**
     *This driver prints out all text from file and then stores it into an 
     *ArrayList to later print it out in reverse order.
     *
     *@param args Command line arguments (not used).
     */
   public static void main(String[] args) throws FileNotFoundException {
      String file;
      ArrayList<String> list = new ArrayList<String>();
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      file = scan.nextLine();
      Scanner scanFile = new Scanner(new File(file));
      
      while (scanFile.hasNext()) {
         list.add(scanFile.next());
      }
      scanFile.close();
      
      //Prints arraylist contents
      System.out.println(list + "\n");
      
      //Prints array elements in regular order.
      int index = 0;
      while (index < list.size()) {
         System.out.print(list.get(index) + " ");
         index++;
      }
      System.out.println("\n");
      
      //Prints array elements in reverse order.
      index = list.size() - 1;
      while (index >= 0) {
         System.out.print(list.get(index) + " ");
         index--;
      }      
   }
}