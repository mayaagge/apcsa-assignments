public class Even{
  public static boolean isEven(int n){
    if (n==0){
      return true;
    }
    if (n==1){
      return false;
    }
    return isEven(n-2);
  }
  public static void main(String[] args){
    System.out.println(isEven(3));
    System.out.println(isEven(2));
  }
}
