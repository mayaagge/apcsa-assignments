public class PracticeExceptions{
  public static void main(String[] args){
    try{
      oddException(3);
    }catch(Exception e){
      System.out.print("It is odd!");
      e.printStackTrace();
    }
  }
  public static void oddException(int n) throws Exception{
    if (n%2 != 0){
      throw new Exception("It is odd!");
    }
    else{
      System.out.println("It is even!");
    }
  }
  public static void negativeException(int[] n) throws Exception{
    for (int i = 0; i < n.length; i++){
      if (n[i] <0){
        throw new Exception("There is a negative number");
      }
    }
    System.out.println("There are all positive numbers");
    }
  public static void nullException(String n) throws Exception{
    try{
      if (n == null){
        throw new NullPointerException("There's nothing here");
      }
    } catch (Exception e){
      System.out.println("There's nothing here");
      e.printStackTrace();
    }
    System.out.println(n.length());
  }
  public static void vowelException(String n) throws Exception{
    try{
      if (! n.contains("a") && ! n.contains("e") && !n.contains("i") && !n.contains("o") && !n.contains("u")){
        throw new Exception("No vowels");
      }
    } catch (Exception e){
      System.out.println("No vowels");
      e.printStackTrace();
    }
  }
}
