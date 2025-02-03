import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
public class Bronze{
  public static void main (String[] args){
    System.out.println(solve("makelake_input.txt"));
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
      //while(input.hasNextLine()){
        for (int i = 0; i < N; i++){
        int row = input.nextInt()-1;
        int column = input.nextInt()-1;
        int depth = input.nextInt();
        stomp(nums, row, column, depth);
      }
      long volume = volume(nums, E);
      input.close();//releases the file from your program
      return volume;

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
  public static void stomp(int[][] n, int r, int c, int d) {
    int max = Integer.MIN_VALUE;
    for (int i = r; i < r + 3; i++) {
        for (int j = c; j < c + 3; j++) {
          if (n[i][j] > max){
              max = n[i][j];
          }
        }
    }
    int d1 = max - d;
    for (int i = r; i < r + 3; i++) {
        for (int j = c; j < c + 3; j++) {
            if (n[i][j] > d1) {
                n[i][j] = d1;
            }
        }
    }
  }
  public static long volume(int[][] n, int elevation) {
    long volumeTotal = 0;
    for (int i = 0; i < n.length; i++) {
        for (int j = 0; j < n[0].length; j++) {
            if (elevation > n[i][j]) {
                volumeTotal += (elevation - n[i][j]);
            }
        }
    }
    return volumeTotal * 72 * 72;
  }
}
