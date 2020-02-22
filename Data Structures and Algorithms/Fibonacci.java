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
      System.out.println(Fib(-0));
   }
   
   public static int Fib(int n) {           
      //Corner Case
      if (n <= 0)           return -1;
      //Base Case
      if (n < 3)           return n - 1;
      //Regular Cases
      return Fib(n - 1) + Fib(n - 2);
   }
}
