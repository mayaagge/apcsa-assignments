public class MyExceptions{
  public static void main(String[] args){
    try{
      int a = 0;
      int b = 0;
      int c = a/b;
    }catch(ArithmeticException e){
      System.out.println("Error division by zero)");
    }
  }
}
      
