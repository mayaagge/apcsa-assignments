public class Hanoi{
  public static void hanoiMild(int n, char source_rod, char destination_rod, char aux_rod){
    if (n==1){
      System.out.println(source_rod + "to" + destination_rod);
    }
    else{
      hanoiMild(n-1, source_rod, aux_rod, destination_rod);
      System.out.println(source_rod + "to" + destionation_rod);
      hanoiMild(n-1, aux_rod, source_rod, aux_rod);
    }
  }
  public static void main (String[] args){
    hanoiMild(3, 'A', 'B', 'C');
  }
}
