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
  NQueens n = new NQueens();
  int [][] board = new int[4][4];
  print(board);
  System.out.println(n.addQueen(board, 0, 0));
  print(board);
  n.removeQueen(board, 0, 0);
  print(board);
 }
  
 private boolean addQueen(int[][] n, int r, int c){
  if (n[r][c] != 0){
   return false;
  }
  else{
    for (int i = r + 1; i < n.length; i++){
       n[i][c] += 1;
     }
      for (int i = 1; i < n.length; i++){
        if (((r + i)< n.length) && ((c + i)< n.length)){
          n[r+i][c+i] += 1;
        }
        if (((r + i) >= 0) && ((c - i) >= 0)){
          n[r+i][c-i] += 1;
        }
      }
      n[r][c] = -1;
       return true;
    }  
  }
  
  /**Remove the queen that was added to r,c
  *@precondition r and c are valid indices of the board array and there is a queen at position r,c
  *@postcondition the board is modified to remove that queen and all it's
  *threatened positions are decremented
  */
 
private void removeQueen(int[][] n, int r, int c){
    for (int i = r + 1; i < n.length; i++){
       n[i][c] -= 1;
     }
      for (int i = 1; i < n.length; i++){
        if (((r + i)< n.length) && ((c + i)< n.length)){
          n[r+i][c+i] -= 1;
        }
        if (((r + i) >= 0) && ((c - i) >= 0)){
          n[r+i][c-i] -= 1;
        }
      }
      n[r][c] = 0;
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
