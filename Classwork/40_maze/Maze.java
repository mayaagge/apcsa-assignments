import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
public class Maze{
  public static void main (String[] args){
    System.out.println(solve("makelake_input.txt"));
  }
  public static int[][] convert(String input_filename){
      try{
        File file = new File(input_filename);
        Scanner input = new Scanner(file);
        int r = 0;
        while (input.hasNextLine()){
          rows++
          String line = input.nextLine();
          char[] a = new char[] (line.split(""));
          int columns = a.length;
        }
        Scanner input2 = new Scanner(file);
        int [][] arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++){
          for (int j = 0; j< arr[i].length; j++){
            arr[i][j] = input.next();
          }
        }
      input.close();//releases the file from your program
      return arr;

    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
    return -1;
  }

