public class Driver{
   public static void main (String[] args){
      NQueens n = new NQueens();
      n.toString();
      n.addQueen(0, 0);
      print(board);
      n.removeQueen(0, 0);
      n.toString();
   }
}
