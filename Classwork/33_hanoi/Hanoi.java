public class Hanoi{
  public static void hanoiMild(int n, char source_rod, char destination_rod, char aux_rod){
    if (n==1){
      return 0;
    }
    hanoiMild(n-1, source_rod, aux_rod, destination_rod);
    System.out.println("Move disk " + n + " from rod " + source_rod + " to rod " + destination_rod);
    hanoiMild(n-1, aux_rod, destination_rod, source_rod);
    }
  }
  public static void main (String[] args){
    hanoiMild(3, 'A', 'B', 'C');
  }
}
