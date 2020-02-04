/**
  *Creates a spherocylinder object.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/3/2020
  */
import java.text.DecimalFormat;
public class Spherocylinder {
   //Fields
   private String label = "";
   private double radius = 0;
   private double cHeight = 0;
   
   //Constructor
   public Spherocylinder (String labelIn, double radiusIn, double cHeightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cHeightIn);
   }
   
   //Methods
   public String getLabel() {
      return label;
   }
   
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   public double getRadius() {
      return radius;
   }
   
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   
   public double getCylinderHeight() {
      return cHeight;
   }
   
   public boolean setCylinderHeight(double cHeightIn) {
      boolean isSet = false;
      if (cHeightIn > 0) {
         cHeight = cHeightIn;
         isSet = true;
      }
      return isSet;
   }
   
   public double circumference() {
      return 2 * Math.PI * radius;
   }
   
   public double surfaceArea() {
      return 2 * Math.PI * radius * (2 * radius + cHeight);
   }
   
   public double volume() {
      return Math.PI * radius * radius * ((4.0 / 3) * radius + cHeight);
   }
   
   //This method gives our object a proper string representation in order to be user readable.
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius "
         + radius + " and cylinder height " + cHeight + " has:"
         + "\n\tcircumference = " + df.format(circumference()) + " units"
         + "\n\tsurface area = " + df.format(surfaceArea()) + " square units"
         + "\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
}

---------------------------------------------------------------------------------------------------------------------------------------------

/**
  *Acts as the driver for the Spherocylinder class.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/3/2020
  */
import java.util.Scanner;
public class SpherocylinderApp {
   /**
     *Creates a spherocylinder object based on user input.
     *
     *@param args Command Line Arguments (not used).
     */
   public static void main(String[] args) {
      //Variables
      String label = "";
      double radius = 0;
      double cHeight = 0;  
      
      //Objects
      Scanner scan = new Scanner(System.in);
      Spherocylinder obj = null;   
   
      //Takes in the object label
      System.out.print("Enter label, radius, and cylinder height for a"
         + "spherocylinder\n\tlabel: ");
      label = scan.nextLine();
         
      //Takes in the radius
      System.out.print("\tradius: ");
      radius = scan.nextDouble();
      if (radius > 0) {
         System.out.print("\tcylinder height: ");
         cHeight = scan.nextDouble();
         if (cHeight > 0) {
            obj = new Spherocylinder(label, radius, cHeight);
            System.out.println("\n" + obj);
         } else {
            System.out.println("Error: cylinder height must be non-negative.");
         }
      } else {
         System.out.println("Error: radius must be non-negative.");
      }
   }
}
