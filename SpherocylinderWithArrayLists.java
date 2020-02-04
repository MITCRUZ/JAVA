/**
  *Creates an arraylist tht accepts only spherocylinder objects in it.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/3/2020
  */
import java.util.ArrayList;
import java.text.DecimalFormat;
public class SpherocylinderList {
   //Fields
   private String listName = "";
   ArrayList<Spherocylinder> list = new ArrayList<Spherocylinder>();
   
   //Constructor
   public SpherocylinderList(String listNameIn, ArrayList<Spherocylinder> listIn) {
      listName = listNameIn;
      list = listIn;
   }
   
   //Methods
   public String getName() {
      return listName;
   }
   
   public int numberOfSpherocylinders() {
      return list.size();
   }
   
   public double totalSurfaceArea() {
      double total = 0;
      //Enhanced for loop
      for (Spherocylinder obj : list) {
         total += obj.surfaceArea();
      }
      return total;
   }
   
   public double totalVolume() {
      double total = 0;
      for (Spherocylinder obj : list) {
         total += obj.volume();
      }
      return total;
   }
   
   public double averageSurfaceArea() {
      double result = 0;
      if (list.size() > 0) {
         result = totalSurfaceArea() / list.size();
      }
      return result;
   }
   
   public double averageVolume() {
      double result = 0;
      if (list.size() > 0) {
         result = totalVolume() / list.size();
      }
      return result;
   }
   
   public String toString() {
      String output = "\n" + listName + "\n\n";
      for (Spherocylinder obj : list) {
         output = output + obj + "\n\n";
      }
      return output;
   }
   
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary  for " + listName + " -----"
         + "\nNumber of Spherocylinders: " + numberOfSpherocylinders()
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + "\nTotal Volume: " + df.format(totalVolume())
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + "\nAverage Volume: " + df.format(averageVolume());
      return output;
   }
}

---------------------------------------------------------------------------------------------------------------------------------------------

/**
  *Acts as a driver for the SpherocylinderList class.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/3/2020
  */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class SpherocylinderListApp {
   /**
     *task
     *
     *@param args Command Line Arguments (not used)
     */
   public static void main(String[] args) throws FileNotFoundException {
      //Variables
      String fileName = "";
      String label = "";
      double radius = 0;
      double cHeight = 0;
      String title = "";
      
      //Objects
      Scanner scan = new Scanner(System.in);
      Scanner scanFile = null;
      Spherocylinder obj;
      ArrayList<Spherocylinder> list = new ArrayList<Spherocylinder>();
      
      //Receives file name
      System.out.print("Enter file name: ");
      fileName = scan.nextLine();
      scanFile = new Scanner(new File(fileName));
      
      //Scans the given file in order to extract the data required to create a spherocylinder object
      title = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         cHeight = Double.parseDouble(scanFile.nextLine());
         
         //Creates the spherocylinder object
         obj = new Spherocylinder(label, radius, cHeight);
         list.add(obj);
      }
      scanFile.close();
      
      //Creates the spherocylinderlist object
      SpherocylinderList sphereList = new SpherocylinderList(title, list);
      
      //Prints the results
      System.out.println(sphereList + sphereList.summaryInfo());
   }
}
