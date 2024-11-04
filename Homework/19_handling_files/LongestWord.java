import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
public class LongestWord{
  public static void main(String[] args){
    readFile();
  }
  public static void readFile(){
    try{
      String l = "";
      File file = new File("my_text.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        String word = input.next();
        if (word.length() > l.length()){
          l = word;
        }
      }
      System.out.println("The longest word is " + l);
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
