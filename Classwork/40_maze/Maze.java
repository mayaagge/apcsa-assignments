import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
public class Maze{
  //public static void main (String[] args){
  //}
  public static char[][] convertMaze(String input_filename){
      try{
        File file = new File(input_filename);
        Scanner input = new Scanner(file);
        int rows = 0;
        int columns = 0;
        while (input.hasNextLine()){
          String line = input.nextLine();
          columns = line.length();
          rows++;
        }
        input.close();
        char[][] maze = new char[rows][columns];
        Scanner input2 = new Scanner(file);
        int row = 0;
        while (scanner.hasNextLine()) {
          String line = input2.nextLine();
          maze[row] = line.toCharArray();
          row++;
        }
        input2.close();
        return maze;
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
    return -1;
  }
  public static void printMaze(char[][] maze) {
      if (maze == null) {
          System.out.println("No maze loaded.");
          return;
      }
      for (char[] row : maze) {
          System.out.println(Arrays.toString(row));
      }
  }
  public static String mazeToString(char[][] maze) {
      if (maze == null) {
          return "";
      }
      String result = "";
      for (char[] row : maze) {
          result += new String(row) + "\n"; 
      }
      return result;
  }
  public static void main(String[] args) {
      String filename = "maze1.txt"; 
      char[][] maze = convertMaze(filename);
      System.out.println("Maze as 1D arrays:");
      printMaze(maze);
      System.out.println("\nMaze as a String:");
      System.out.println(mazeToString(maze));
  }
}

