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
        testNQueens(4);
        testNQueens(6);
        testNQueens(8);
    }

    private static void testNQueens(int size) {
        System.out.println("Testing " + size + "-Queens Problem:");
        NQueens nq = new NQueens(size);
        
        System.out.println("Solving...");
        nq.solve();
        System.out.println(nq);
        
        System.out.println("Counting total solutions...");
        nq.countSolutions();
        System.out.println("-------------------------------");
    }
}
