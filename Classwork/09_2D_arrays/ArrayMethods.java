import java.util.Arrays;
public class ArrayMethods
{
    public static void main(String[] args)
    {
      // Create test cases here
      int[][] some = {{8,4,2},{1,0,9},{5,7,8}};
      int[][] none = {{},{},{}};
      int[][] done = {{8,4,2,3},{1,0},{5,7,8,7}};
      print(some);
      print(none);
      print(done);
      System.out.println(findSum(some));
      System.out.println(findSum(none));
      System.out.println(findSum(done));
      System.out.println(transpose(some));
      System.out.println(transpose(none));
      System.out.println(transpose(done));
    }
    
    
    public static void print(int[][] array){
      String[] b = new String[array.length];
      for (int i=0; i< array.length; i++)
      {
        b[i] = Arrays.toString(array[i]);
      }
      System.out.println(Arrays.toString(b));
    }
  
    public static int findSum(int[][] array){
      int add = 0;
      for (int i=0; i< array.length; i++)
      {
        for (int x =0; x < array[i].length; x++)
        {
          add += array[i][x];
        }
      }
      return add;
    }
        

    public static int[][] transpose(int[][] array){
      int[][] shift = new int[array.length][array.length];
      for (int i=0; i< array.length; i++)
      {
        for (int x =0; x < array[i].length; x++)
        {
          if (array.length == array[i].length)
          {
              shift[x][i] += array[i][x];
          }
          else
          {
              return Arrays.toString(array);
          }
        }
      }
      return Arrays.toString(shift);
    } 
  
}
