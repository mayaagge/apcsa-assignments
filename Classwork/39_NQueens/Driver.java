public class Driver{
    public static void main(String[] args) {
        testNQueens(4);
        testNQueens(6);
        testNQueens(8);
    }

    private static void testNQueens(int size) {
        System.out.println("Testing " + size + " queens");
        NQueens queen = new NQueens(size);
        queen.solve(); 
        queen.countSolutions();
        System.out.println("-------------------------------");
    }
}
