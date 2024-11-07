import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
public class VerticalTriangles{
  public static void main(String[] args){
    readFile();
  }
   public static void print(int[][] array){
      String[] b = new String[array.length];
      for (int i=0; i< array.length; i++)
      {
        b[i] = Arrays.toString(array[i]);
      }
      System.out.println(Arrays.toString(b));
    }
  public static void readFile(){
    try{
      int i = 0;
      int j = 0;
      int k = 0;
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
      int[][] nums = new int [1914][3];
      while(input.hasNextInt()){
        int numy = input.nextInt();
        nums[i][j] = numy;
        i+=1914/3;
        if (i>=1914){
          j++;
          if(j == 3){
            j=0;
            k++;
            i=k;
            if (i >=1914/3){
              break;
            }
          }
          else{
            i = 0;
          }
        }
      }
      System.out.println("The 2d array is");
      print(nums);
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
