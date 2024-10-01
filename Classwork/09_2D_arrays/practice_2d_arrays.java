import java.util.Arrays;
public class practice_2d_arrays
{

  public static void main(String[] args)
    {
      // Create test cases here.
      int[][] arr1 = {{1,2,3},{2,3,4,5},{1}};
      int[][] arr2 = {{1,3},{4,5},{1,7}};
      rowSwap(arr1, 2, 1);
      rowSwap(arr2, 0, 2);
      colSwap(arr2, 1, 0);
      
      
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
      String[] b = new String[array.length];
      for (int i=0; i< array.length; i++)
      {
        b[i] = Arrays.toString(array[i]);
      }
      System.out.println(Arrays.toString(b));
    }

  
    /**
     * Swaps all values in the specified 2 columns of array.
     */
    public static void colSwap(int[][] array, int colAIndex, int colBIndex)
    {
        // Your code here
      int[][] newArray = new int[array.length][array.length];
      for (int x = 0; x < array.length; x++)
      {
        for (int y =0; y < array[x].length; y++)
        {
          newArray[y][x] = array[x][y];
        }
      }
      int[]temp = (newArray[colBIndex]).clone();
      newArray[colBIndex]= newArray[colAIndex];
      newArray[colAIndex] = temp;
      String[] b = new String[newArray.length];
      for (int i=0; i< newArray.length; i++)
      {
        b[i] = Arrays.toString(newArray[i]);
      }
      System.out.println(Arrays.toString(b));
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
      String[][] charArray = new String[rows][cols];
      for (int x =0; x <charArray.length; x++)
        {
          for (int y = 0; y<charArray[x].length; y++)
            {
              if (str.length()>= rows*cols || (x*cols+y) <= str.length()-1)
              {
                 charArray[x][y] = str.substring((x*cols+y),(x*cols+y+1));
              }
              else if (str.length()< rows*cols && (x*cols+y) > str.length()-1)
              {
                break;
              }
            }
        }
        return charArray; // replace this with your 2D array
    }
  
}    
