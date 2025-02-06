public class Fibonacci{
  public int fibIter(int n, int f1, int f2){
    if (n==0){
      return f2;
    }
    return fibIter(n-1, f1+f2,f1);
  }
}
