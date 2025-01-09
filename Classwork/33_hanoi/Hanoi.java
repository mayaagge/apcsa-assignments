public class Hanoi{
  public static void hanoiMild(int n, char source_rod, char destination_rod, char aux_rod){
    if (n==1){
      System.out.println(source_rod + "to" + aux_rod);
    }
    else{
      hanoiMild(n-1, source_rod, destination_rod, aux_rod);
      System.out.println(source_rod + "to" + aux_rod);
      hanoi(n-1, destination_rod, source_rod, aux_rod);
    }
  }
  public static void main (String[] args){
    hanoi(3, 'A', 'B', 'C');
  }
}
