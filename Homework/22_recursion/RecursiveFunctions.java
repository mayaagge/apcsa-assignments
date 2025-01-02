public class RecursiveFunctions{
   public static int sumDigits(int n){
    if (n == 0){
      return 0;
    }
    return sumDigits(n/10) + n%10;
  }
  public static int fibonacci(int n){
    if (n == 0){
      return 0;
    }
    else if(n==1){
      return 1;
    }
    else{
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
  public static void main(String[] args){
    int[] n1 = new int[] {1,2,3,4,5};
    int[] n2 = new int[] {1};
    System.out.println(sumDigits(12945));
     System.out.println(fibonacci(10));
     System.out.println(fibonacci(46));
     System.out.println(fibonacci(47));
     System.out.println(fibonacci(48));
     System.out.println(fibonacci(49));
     System.out.println(fibonacci(50));
  } 
}

//1. take 0.084s to run
//2. 
