public class Driver{
   public static void main (String[] args){
      NQueens n = new NQueens();
      int [][] board = new int[4][4];
      print(board);
      n.addQueen(board, 0, 0);
      print(board);
      n.removeQueen(board, 0, 0);
      print(board);
   }
}
