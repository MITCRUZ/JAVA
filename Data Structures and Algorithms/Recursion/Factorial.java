/**
  *Uses recursion to solve a mathematical problem.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/21/2020
  */
public class Factorial {
   /**
     *This program uses recursion to cut down the problem into smaller 
     *pieces and output the factorial of any int type entered
     *
     *@param args Command Line Arguments
     */
   public static void main(String[] args) {
      System.out.println(factorial(3));
   }
   
   public static int factorial(int input) {
      if (input == 0)                return 1;               
      else                          return input * factorial(input - 1);                     
   }
}
