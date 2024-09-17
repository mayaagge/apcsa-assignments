import java.util.Scanner;

class MyScanner{
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
    System.out.println("Dinner: " + "$" + dinner);
    System.out.println("Laser Tag: " + "$" + laserTag);
    System.out.println("Ice cream: " + "$" + iceCream);
    System.out.println("Grand Total: " + "$" + dinner+laserTag+iceCream);
  }
}
