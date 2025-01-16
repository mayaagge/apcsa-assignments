import java.util.*;
 import java.util.ArrayList;
public class Hanoi{
  public static void hanoiMild(int n, char source_rod, char destination_rod, char aux_rod){
    if (n==1){
      System.out.println("Move ring 1 from source " +  source_rod + " to destination " + destination_rod);
      return;
    }
    hanoiMild(n-1, source_rod, aux_rod, destination_rod);
    System.out.println("Move ring " + n + " from source " + source_rod + " to destination " + destination_rod);
    hanoiMild(n-1, aux_rod, destination_rod, source_rod);
  }
  public static void hanoiMedium(int n, char source_rod, char destination_rod, char aux_rod){
    hanoiMild(n, source_rod, destination_rod, aux_rod);
    double a = Math.pow(2,n)-1;
    System.out.println("Total number of moves: " + a);
  }

  public static void hanoiSpicy(int n, char source_rod, char destination_rod, char aux_rod, ArrayList<Integer> rod1, ArrayList<Integer>, rod2, ArrayList<Integer> rod3){
   if (n==1){
      System.out.println("Move ring 1 from source " +  source_rod + " to destination " + destination_rod);
      helper(source_rod, destination_rod, aux_rod);
        System.out.println("Rod A: " + rod1.toString());
      System.out.println("Rod B: " + rod2.toString());
      System.out.println("Rod C: " + rod3.toString());
    }
    hanoiSpicy(n-1, source_rod, aux_rod, destination_rod);
    System.out.println("Move ring " + n + " from source " + source_rod + " to destination " + destination_rod);
    helper(source_rod, destination_rod, aux_rod);
    System.out.println("Current state of rods");
    System.out.println("Rod A: " + rod1.toString());
    System.out.println("Rod B: " + rod2.toString());
    System.out.println("Rod C: " + rod3.toString());
    hanoiSpicy(n-1, aux_rod, destination_rod, source_rod);
  }    
public static void helper(char source_rod, char destination_rod, char aux_rod){
    if(destination_rod == 'C'){
      if(source_rod == 'A'){
        int a = rod1.remove(2);
        rod3.add(a);
      }
      if(source_rod == 'B'){
        int b = rod2.remove(2);
        rod3.add(b);
      }
    }
    if(destination_rod == 'B'){
      if(source_rod == 'A'){
        int a = rod1.remove(2);
        rod2.add(a);
      }
      if(source_rod == 'C'){
        int c = rod3.remove(2);
        rod2.add(c);
      }
    }
    if(destination_rod == 'A'){
      if(source_rod == 'C'){
        int c = rod3.remove(2);
        rod1.add(c);
      }
      if(source_rod == 'B'){
        int b = rod2.remove(2);
        rod1.add(b);
      }
    }
}
  public static void main (String[] args){
    ArrayList<Integer> rod1 = new ArrayList<Integer>();
    ArrayList<Integer> rod2 = new ArrayList<Integer>();
    ArrayList<Integer> rod3 = new ArrayList<Integer>(); 
    rod1.add(3);
    rod1.add(2);
    rod1.add(1);
    hanoiMild(4, 'A', 'C', 'B');
    hanoiMedium(3, 'A', 'B', 'C');
    hanoiSpicy(3, 'A', 'C', 'B');
  }
}
