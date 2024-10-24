import java.util.Scanner;
public class ExtremesDriver{
    public static void main (String[] args){
      Extremes a = new Extremes();
      Scanner input = new Scanner(System.in);
      System.out.println("Guess the maximum Integer value: ");
      int value = input.nextInt();
      input.newLine();
      System.out.println("You were off by 21" + a.MaxDiff(value));
      System.out.println("Guess the minimum Integer value: ");
      int value1 = input.nextInt();
      input.newLine();
      System.out.println("You were off by 21" + a.minValue(value1));
    }

}
