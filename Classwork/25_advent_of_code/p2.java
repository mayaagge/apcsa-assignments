
import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
import java.util.ArrayList;

public class p2{
  public static void main(String[] args){
    readFile();
  }
  public static void readFile(){
    try{
      String ans = "";
      int directioning = 5;
      File file = new File("stuff.txt");
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String direction = input.nextLine();
        for (int i = 0; i< direction.length(); i++){
          if ((direction.charAt(i)) == ('L')){
            if (directioning != 1 && directioning != 4 && directioning != 7){
              directioning --;
            }
          }
          else if ((direction.charAt(i)) == ('R')){
            if (directioning != 3 && directioning != 6 && directioning != 9){
              directioning ++;
            }
          }
          else if ((direction.charAt(i)) == ('U')){
            if (directioning != 1 && directioning != 2 && directioning != 3){
              directioning -= 3;
            }
          }
          else if ((direction.charAt(i)) == ('D')){
            if (directioning != 7 && directioning != 8 && directioning != 9){
              directioning += 3;
            }
          }
        }
        ans += directioning;
      }
      System.out.println("The code is " + ans);
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
