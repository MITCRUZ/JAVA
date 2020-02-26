/**
  *Demontrates the basic operations of 2-D arrays
  *
  *@author Mitchel Santillan Cruz
  *@version 2/25/2020
  */
public class TwoDArrays {
   /**
     *Allows the user to add, remove, find, populate and clear all values from a 2 dimensional array
     *
     *@param args Command Line Arguments (not used)
     */
   public static void main(String[] args) {
      int[][] list = new int[5][5];   
      
      //Populates the array with values and prints the array
      populateArray(list);
      arrayStatus(list);
      System.out.println("Populated the array with values\n");
      
      //Prints the index of in value your looking for
      System.out.println("Searching for the value 14");
      searchForValue(list, 14);
      
      System.out.println();
      
      //deletes 14 by replacing its value with 0      
      deleteValue(list, 14);
      arrayStatus(list);
      System.out.println("Deleted value 14 from this 2-D array\n");
      
      //Erases everything in the array and prints the status
      eraseMemory(list);
      arrayStatus(list);
      System.out.println("Cleared out everything from the array");
   }
   
   //Allows the user to insert a value in the array
   public static void insertValue(int[][] arr, int key, int rowIn, int colIn) {
      if (arr[rowIn][colIn] != 0)          System.out.println("The slot is taken");
      else {
         arr[rowIn][colIn] = key;
      }
   }
   
   //Populates the array with values incrementing by 1
   public static void populateArray(int[][] arr) {
      int i = 1;
      for (int row = 0; row < arr.length; row++) {
         for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = i++;
         }         
      }   
   }
   
   //Prints the current elements in the array
   public static void arrayStatus(int[][] arr) {
      for (int row = 0; row < arr.length; row++) {
         for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col] + " ");
         }
         System.out.println();
      }   
   }
   
   //Sets all the values in the array to 0
   public static void eraseMemory(int[][] arr) {
      for (int row = 0; row < arr.length; row++) {
         for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = 0;
         }
      }
   }
   
   //Deletes a value from the array given an array, index and size of array
   public static void deleteValue(int[][] arr, int target) {
      for (int row = 0; row < arr.length; row++) {
         for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col] == target)       
               arr[row][col] = 0;
         }         
      }     
   }    
   
   //Searches for a given value in the 2-D array
   public static void searchForValue(int[][] arr, int target) {
      for (int row = 0; row < arr.length; row++) {
         for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col] == target)       
               System.out.println("Found target at row " + (row + 1) + " and col " + (col + 1));
         }         
      }      
   }
}
