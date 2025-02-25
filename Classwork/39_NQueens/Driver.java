public class Driver{
   /*
   public static void main (String[] args){
      NQueens n = new NQueens(4);
      n.toString();
      n.addQueen(0, 0);
      n.toString();
      n.removeQueen(0, 0);
      n.toString();
   }
   */
    public static void main(String[] args) {
        testNQueens(new NQueens(4));
        testNQueens(new NQueens(6));
        testNQueens(new NQueens(8));
    }

    private static void testNQueens(NQueens nq) {
        int size = nq.getBoardSize();
        System.out.println("Testing " + size + "-Queens Problem:");
        
        System.out.println("Solving...");
        nq.solve();
        System.out.println(nq);
        
        System.out.println("Counting total solutions...");
        int totalSolutions = nq.countSolutions();
        System.out.println("Total solutions for " + size + "-Queens: " + totalSolutions);
        System.out.println("-------------------------------");
    }
}
