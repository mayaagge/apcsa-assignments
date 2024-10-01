import java.util.Arrays;
public class practice_2d_arrays
{

  public static void main(String[] args)
    {
      // Create test cases here.
      int[][] arr1 = {{1,2,3},{2,3,4,5},{1}};
      rowSwap(arr1, 2, 1);
      
      // Print the status of your 2D array before and after
      // invoking a method. You will need to add a print() method
      // to avoid duplicated code in your main.
    }

  
    /*
     * Swaps all values in the specified 2 rows of array.
    */
  public static void rowSwap(int[][] array, int rowAIndex, int rowBIndex)
    {
      int[]temp = (array[rowBIndex]).clone();
      array[rowBIndex]= array[rowAIndex];
      array[rowAIndex] = temp;
      System.out.println(Arrays.toString(array));
    }

  
    /**
     * Swaps all values in the specified 2 columns of array.
     */
    public static void colSwap(int[][] array, int colAIndex, int colBIndex)
    {
        // Your code her
    }

  
    /*
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.

     Examples:

      String[][] result = fillRows("Happy Halloween", 3, 4);
      
      result (after method call):
      "H"     "a"     "p"     "p"
      "y"     " "     "H"     "a"
      "l"     "l"     "o"     "w"
      
      
      String[][] result = fillRows("hello", 3, 4);
      
      result (after method call):
      "h"     "e"     "l"     "l"
      "o"     null    null    null
      null    null    null    null

     */
    public static String[][] fillRows(String str, int rows, int cols)
    {
        return null; // replace this with your 2D array
    }
  
}    
