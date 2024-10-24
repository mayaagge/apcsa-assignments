public class CurrencyDriver{
  public static void main (String[] args){
    Currency m = Currency (12.34);
    System.out.println("Value of bankroll:" + m.toString());
    System.out.println("Dollars:" + m.getDollars());
    System.out.println("Cents:" + m.getCents());
  }
}

