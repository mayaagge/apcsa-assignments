public class Hanoi{
  public static void hanoiMild(int n, char source_rod, char destination_rod, char aux_rod){
    if (n==1){
      System.out.println("Move disk 1 from rod " +  source_rod + " to rod " + destination_rod);
      return;
    }
    hanoiMild(n-1, source_rod, aux_rod, destination_rod);
    System.out.println("Move ring " + n + " from source " + source_rod + " to destination " + destination_rod);
    hanoiMild(n-1, aux_rod, destination_rod, source_rod);
  }
  public static void hanoiMedium(int n, char source_rod, char destination_rod, char aux_rod){
    hanoiMild(n, source_rod, destination_rod, aux_rod);
    int a = Math.pow(2,n)-1;
    System.out.println("Total number of moves: " + a);
  }
  public static void main (String[] args){
    hanoiMild(4, 'A', 'C', 'B');
    hanoiMedium(3, 'A', 'B', 'C');
  }
}
