import java.util.Scanner;
import java.util.Arrays;
/**
*@return true when the queen added correctly, false Otherwise
*@precondition r and c are valid indices of the board array
*@postcondition the board is only changed when the function returns true
* in which case the queen is added and all it's threatened positions are incremented.
*/
public class NQueens{
 private int[][] board;
 private boolean addQueen(int r, int c){
  if (board[r][c] != 0){
   return false;
  }
  else{
    for (int i = r + 1; i < board.length; i++){
       board[i][c] += 1;
     }
      for (int i = 1; i < board.length; i++){
        if (((r + i)< board.length) && ((c + i)< board.length)){
          board[r+i][c+i] += 1;
        }
        if (((r + i) >= 0) && ((c - i) >= 0)){
          board[r+i][c-i] += 1;
        }
      }
      board[r][c] = -1;
       return true;
    }  
  }
  
  /**Remove the queen that was added to r,c
  *@precondition r and c are valid indices of the board array and there is a queen at position r,c
  *@postcondition the board is modified to remove that queen and all it's
  *threatened positions are decremented
  */
 
private void removeQueen(int r, int c){
    for (int i = r + 1; i < board.length; i++){
       board[i][c] -= 1;
     }
      for (int i = 1; i < board.length; i++){
        if (((r + i)< board.length) && ((c + i)< board.length)){
          board[r+i][c+i] -= 1;
        }
        if (((r + i) >= 0) && ((c - i) >= 0)){
          board[r+i][c-i] -= 1;
        }
      }
      board[r][c] = 0;
    }  
  public static void print(int[][] array){
    String[] b = new String[array.length];
    for (int i=0; i< array.length; i++)
    {
      b[i] = Arrays.toString(array[i]);
     System.out.println(b[i]);
    }
   System.out.println();
  }
 /*
 public void solve(){
  solve(0);
 }
 public boolean solve(int row){
 }
 public void countSolutions(){
 }
 public int countSolutions(int row){
 }
 */
 public String toString(){
  String row = "";
  for (int i = 0; i< board.length; i++){
   for (int j = 0; j<board.length; j++){
    if (board[i][j] == -1){
     row += "Q";
    }
    else{
     row += "_";
    }
   }
   row += "\n";
}
  return row;
 }
}
