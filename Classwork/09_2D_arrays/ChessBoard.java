public class ChessBoard
{
    public static void main(String[] args)
    {
      //Create an 8x8 2D String array called chess.
      String[][] chess= new String[8][8];
      for (int i = 0; i < 9; i++)
      {
        if (i==0 || i==7)
        {
          chess[i] = new String ["Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight","Rook"];
        }
        if (i==1 || i==6)
        {
          for (int i = 0; i < 8; i++)
          {
            chess[i][i] = "Pawn";
          }
        }
      }
       print(chess);
    }
 
    public static void print(String[][] array)
    {
      //Use this method to print the chess board onto the console
      for (int i = 0; i < 9; i++)
      {
        System.out.println(chess[i]);
      }
    }
}
