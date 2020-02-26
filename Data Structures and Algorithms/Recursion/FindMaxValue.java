/**
  *Uses Iteration to solve a mathematical problem.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/22/2020
  */
public class FindMaxValue {
   /**
     *This program uses iteration to linearly traverse our array and find the maximum value of an unsorted array
     *
     *@param args Command Line Arguments
     */
   static int v_max = Integer.MIN_VALUE;
   public static void main(String[] args) {  
      int[] arr = {5, 2, 5, 2, 9, 23, 64, 3, 7, 101};  
        
      //Test through iteration
      System.out.println(Max(arr, arr.length));
      
      //Test through recursion
      System.out.println(Max2(arr, arr.length - 1));
   }
   
   //Solving the given problem through ITERATION
   public static int Max(int[] arrIn, int elements) {           
      int maxValue = Integer.MIN_VALUE;                             //o(1)
      for (int i = 0; i < arrIn.length; i++) {                      //o(n)
         if (arrIn[i] > maxValue)         maxValue = arrIn[i];      //o(1) + o(1) = o(1)
      }
      return maxValue;                                              //o(1)
   }
   //When calculating run time for algorith, we can safely omit constants!
   //Run Time: o(1) + o(n) + o(1) + o(1) = o(n) + o(1) = O(N) 
   
   //Solving the given problem through RECURSION
   public static int Max2(int[] arrIn, int n) {
      //Base Case
      if (n < 0)                       return v_max;
      else if (arrIn[n] > v_max)       v_max = arrIn[n];
      return Max2(arrIn, n - 1);
   }
}
