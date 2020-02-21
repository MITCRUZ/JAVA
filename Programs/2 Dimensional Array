/**
  *Adds up all of the values in a 2-dimensional array.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/11/2020
  */
public class Sandbox {
   /**
     *Creates a 2-D array, prints it, and sums up all the values and returns an answer.
     *
     *@param args Command Line Arguments (not used).
     */
   public static void main(String[] args) {
      //Creates a 3x4 2-dimensional array
      int[][] list = {
         {1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12},
      };
      
      int sum = 0;
      //Sums all values together
      for (int row = 0; row < list.length; row++) {
         sum = 0;
         for (int col = 0; col < list[row].length; col++) {
            sum += list[row][col];
         }
      }
      
      //prints out all of the values for the 2-dimensional array
      for (int row = 0; row < list.length; row++) {
         for (int col = 0; col < list[row].length; col++) {
            System.out.print(list[row][col] + "\t");
         }
         System.out.println();
      }
      
      System.out.println("\nTotal: " + sum);
   }
}
