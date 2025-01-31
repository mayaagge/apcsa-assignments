import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
public class Bronze{
  public static void main (String[] args){
    solve("makelake_input.txt");
  }
  public static long solve(String input_filename){
      try{
        File file = new File(input_filename);
        Scanner input = new Scanner(file);
        int R = input.nextInt();
        int C = input.nextInt();
        int E = input.nextInt();
        int N = input.nextInt();
        int[][] nums = new int [R][C];
        for (int i = 0; i<R; i++){
          for(int j = 0; j<C; j++){
            nums[i][j] = input.nextInt();
          }
        }
      print(nums);
      while(input.hasNextLine()){
        int row = input.nextInt();
        int column = input.nextInt();
        int stomp = input.nextInt();
        int [][] smallArray = new int[3][3];
      }
      long n = 1039203;
      input.close();//releases the file from your program
      return n;
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
    return -1;
  }

  public static void print(int[][] array){
    String[] b = new String[array.length];
    for (int i=0; i< array.length; i++)
    {
      b[i] = Arrays.toString(array[i]);
    }
    System.out.println(Arrays.toString(b));
  }
}
