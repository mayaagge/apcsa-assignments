public class MyExceptions{
  public static void main(String[] args){
    try{
      int a = 0;
      int b = 0;
      int c = a/b;
    }catch(ArithmeticException e){ //can also use Exception but better to use specific exception
      System.out.println("Error division by zero");
      e.printStackTrace();
    }
  }
}
      
