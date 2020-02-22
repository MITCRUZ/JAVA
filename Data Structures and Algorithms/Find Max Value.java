/**
  *Uses Iteration to solve a mathematical problem.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/22/2020
  */
public class MaxValue {
   /**
     *This program uses iteration to linearly traverse our array and find the maximum value
     *
     *@param args Command Line Arguments
     */
   public static void main(String[] args) {  
      int[] arr = {5, 2, 5, 2, 9, 23, 64, 3, 7, 101};    
      System.out.println(Max(arr, arr.length));
   }
   
   public static int Max(int[] arrIn, int elements) {           
      int maxValue = Integer.MIN_VALUE;
      for (int i = 0; i < arrIn.length; i++) {
         if (arrIn[i] > maxValue)         maxValue = arrIn[i];
      }
      return maxValue;
   }
}
