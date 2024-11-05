import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
public class ReadFile{
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
      int[][] nums = new int [4][4];
      File file = new File("2d.txt");
      Scanner input = new Scanner(file);
      while (input.hasNextLine()-1){
        String line = input.nextLine();
        while(input.hasNextInt()-1){
          int numy = input.nextInt();
          System.out.println(numy);
          nums[i][j] = numy;
          j++;
          }
        i++;
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
