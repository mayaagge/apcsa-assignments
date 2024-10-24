import java.util.Scanner;
public class ExtremesDriver{
    public static void main (String[] args){
      Extremes a = new Extremes();
      Scanner input = new Scanner(System.in);
      System.out.println("Guess the maximum Integer value: ");
      int value = input.nextInt();
      input.nextLine();
      System.out.println("You were off by " + a.maxDiff(value));
      System.out.println("Guess the minimum Integer value: ");
      value = input.nextInt();
      input.nextLine();
      System.out.println("You were off by " + a.minDiff(value));
    }

}
