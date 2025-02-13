import java.util.Scanner;
import java.util.Arrays;
/**
*@return true when the queen added correctly, false Otherwise
*@precondition r and c are valid indices of the board array
*@postcondition the board is only changed when the function returns true
* in which case the queen is added and all it's threatened positions are incremented.
*/
public class NQueens{
  public static void main (String[] args){
    int[][] arr = new int[4][4];
    addQueen(arr, 2, 3);
    print(arr);
    removeQueen(arr, 2, 3);
    print(arr);
  }
  
  public static boolean addQueen(int[][] n, int r, int c){
    if (c >=0 && n < n.length && r >=0 && r < n.length){
      for (int i = 0; i < n.length; i++){
        n[r-1][i] += 1;
      }
      for (int i = 0; i < n.length; i++){
        n[i][c-1] += 1;
      }
      for (int i = 0; i < n.length/2; i++){
        if (((r + i)< n.length) && ((c + i)< n.length)){
          n[r+i][c+i] += 1;
        }
        if (((r - i) >= 0) && ((c - i) >= 0)){
          n[r-i][c-i] += 1;
        }
      }
      n[r-1][c-1] = -1;
      return true;
    }  
    return false;
  }
  
  /**Remove the queen that was added to r,c
  *@precondition r and c are valid indices of the board array and there is a queen at position r,c
  *@postcondition the board is modified to remove that queen and all it's
  *threatened positions are decremented
  */
  public static void removeQueen(int[][] n, int r, int c){
    if (c >=0 && n < n.length && r >=0 && r < n.length){
      for (int i = 0; i < n.length; i++){
        n[r-1][i] -= 1;
      }
      for (int i = 0; i < n.length; i++){
        n[i][c-1] -= 1;
      }
      for (int i = 0; i < n.length/2; i++){
        if (((r + i)< n.length) && ((c + i)< n.length)){
          n[r+i][c+i] -= 1;
        }
        if (((r - i) >= 0) && ((c - i) >= 0)){
          n[r-i][c-i] -= 1;
        }
      }
      n[r-1][c-1] = 0;
      return true;
    }  
    return false;
  }
  public static void print(int[][] array){
    String[] b = new String[array.length];
    for (int i=0; i< array.length; i++)
    {
      b[i] = Arrays.toString(array[i]);
    }
    System.out.println(Arrays.toString(b));
  }
}
