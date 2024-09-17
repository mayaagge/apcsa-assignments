import java.util.Scanner;

public class NightOut{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("How much does dinner usually cost?");
    double dinner = input.nextDouble();
    input.nextLine();
    System.out.println("How much is laser tag for one person?");
    double laserTag = input.nextDouble();
    input.nextLine();
    System.out.println("How much does a triple scoop cost");
    double iceCream = input.nextDouble();
    input.nextLine();
    double total = (dinner*3.0) + (laserTag*2.0) + (iceCream*4.0/3.0);
    System.out.println("Dinner: " + "$" + dinner*3.0);
    System.out.println("Laser Tag: " + "$" + laserTag*2.0);
    System.out.println("Ice cream: " + "$" + iceCream* 4.0/3.0);
    System.out.println("Grand Total: " + "$" + total);
  }
}
