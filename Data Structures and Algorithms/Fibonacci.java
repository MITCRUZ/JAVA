/**
  *Uses recursion to solve a mathematical problem.
  *
  *@author Mitchel Santillan Cruz
  *@version 2/21/2020
  */
public class Fibonacci {
   /**
     *This program uses recursion to cut down the problem into smaller 
     *pieces and output the the nth fibonaccia number. If the user inputs 
     *an invalid position, then -1 is the result
     *
     *@param args Command Line Arguments
     */
   public static void main(String[] args) {      
      System.out.println(fib(-3));
   }
   
   public static int fib(int n) {     
      if (n < 1)                       return -1;
      else if (n == 1 || n == 2)       return n -1;
      return fib(n - 1) + fib(n - 2);            
   }
}
