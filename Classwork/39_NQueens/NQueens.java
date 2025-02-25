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
 public NQueens(int size){
  this.board = new int[size][size];
 }
 public boolean addQueen(int r, int c){
  if (board[r][c] != 0){
   return false;
  }
  board[r][c] = -1;
  for (int i = r + 1; i < board.length; i++){
     board[i][c] += 1;
     if ((c + (i-r))< board.length){
        board[r+i][c+(i-r)] += 1;
      }
      if ((c - (i-r)) >= 0){
        board[i][c-(i-r)] += 1;
      }
    }
    return true;
  }  
  
  /**Remove the queen that was added to r,c
  *@precondition r and c are valid indices of the board array and there is a queen at position r,c
  *@postcondition the board is modified to remove that queen and all it's
  *threatened positions are decremented
  */
 
public void removeQueen(int r, int c){
  board[r][c] = 0;
  for (int i = r + 1; i < board.length; i++){
     board[i][c] -= 1;
     if ((c + (i-r))< board.length){
        board[r+i][c+(i-r)] -= 1;
      }
      if ((c - (i-r)) >= 0){
        board[i][c-(i-r)] -= 1;
      }
    }
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
 
 public void solve(){
     board = new int[board.length][board.length];
     solve(0);
 }
 public boolean solve(int row){
    if (row == board.length){
     return true;
    }
    for (int i = 0; i < board.length; i++) {
       if (addQueen(row, i)) {
          if (solve(row + 1)){
           return true;
          }
          removeQueen(row, i);
        }
      }
    if(row==0){
    board = new int[board.length][board.length];
   }
   return false;
 }
 public void countSolutions(){
  board = new int[board.length][board.length];
  System.out.println("Total solutions: " + countSolutions(0));
 }
 public int countSolutions(int row){
    if (row == board.length) return 1;
      int solutions = 0;
      for (int i = 0; i < board.length; i++) {
         if (addQueen(row, i)) {
            solutions += countSolutions(row + 1);
            removeQueen(row, i);
          }
      }
    return solutions;
 }

 public String toString(){
  String result = "";
  for (int i = 0; i< board.length; i++){
   for (int j = 0; j<board.length; j++){
    if (board[i][j] == -1){
     result += "Q";
    }
    else{
     result += "_";
    }
   }
   result += "\n";
}
  return result;
 }
}
