public class Even{
  public static boolean isEven(int n){
    if (n==0){
      return true;
    }
    if (n==1){
      return false;
    }
    isEven(n-2);
  }
  public static void main(String[] args){
    int n1 = 5;
    int n2 = 10;
    System.out.println(isEven(n1));
    System.out.println(isEven(n2));
  }
}
