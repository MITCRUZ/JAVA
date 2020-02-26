public class BinarySearch {
   public static void main(String[] args) {
      int[] list = {1, 12, 34, 56, 78, 90, 11};
      int target = 1;
      long startTimeItr = System.nanoTime();          
      System.out.println("Iteration:\n\tidx = " + BinarySearchItr(list, target));
      long endTimeItr = System.nanoTime();
      System.out.println("Elapsed time in nanoseconds: " + (endTimeItr - startTimeItr) + "\n");
      
      long startTimeRcr = System.nanoTime(); 
      System.out.println("Recursion:\n\tidx = " + BinarySearchRcr(list, target, 0, list.length - 1));
      long endTimeRcr = System.nanoTime();
      System.out.println("Elapsed time in nanoseconds: " + (endTimeRcr - startTimeRcr));
   }
   
   //Iterative Solution   
   public static int BinarySearchItr(int[] arr, int key) {
      int left = 0;                                                              //o(1)
      int right = arr.length - 1;                                                //o(1)
      while (left <= right) {                                                    //o(logn)      
         int mid = (left + right) / 2;                                           //o(1)
         if (arr[mid] > key)                   right = mid - 1;                  //o(1)
         else if (arr[mid] < key)              left = mid + 1;                   //o(1)
         else return mid;                                                        //o(1)
      }     
      return -1;                                                                 //o(1)
   }
   //RunTime: o(1) + o(logn) = o(logn)
   
   //Recursive Solution
   public static int BinarySearchRcr(int[] arr, int key, int left, int right) {
      int mid = (left + right) / 2;
      //Base Case
      if (left == right) {
         if (arr[mid] == key)               return mid;
         else                                return -1;
      }   
      //Recursive Steps   
      if (arr[mid] > key)                    return BinarySearchRcr(arr, key, left, mid - 1);
      else if (arr[mid] < key)               return BinarySearchRcr(arr, key, mid + 1, right);
      return mid;
   }
}
