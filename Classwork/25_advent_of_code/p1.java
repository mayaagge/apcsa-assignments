import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
public class p1{
  public static void main(String[] args){
    readFile();
  }
  public static void readFile(){
    try{
      int distance = 0;
      int directioning = 0;
      int x = 0;
      int y = 0;
      File file = new File("directions.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        String direction = input.next();
        if ((direction.charAt(0)).equals("L")){
          directioning --;
        }
        else if ((direction.charAt(0)).equals("R")){
          directioning ++;
        }
        while (directioning<0){
          directioning += 4;
        }
        distance = Integer.parseInt(direction.substring(1, directioning.length()-1));
        if(directioning%4 == 0){
          y += distance;
        }
        if(directioning%4 == 1){
          x += distance;
        }
        if(directioning%4 == 2){
          y-=distance;
        }
        if(directioning%4 == 3){
          x-=distance;
        }
      }
      System.out.println("The steps in x direction is " + x);
      System.out.println("The steps in y direction is " + y);
      int z = x+y;
      System.out.println("The distance is " + z);
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
