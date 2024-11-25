import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
import java.util.ArrayList;

public class p1{
  public static void main(String[] args){
    readFile();
  }
  public static void readFile(){
    try{
      int distance = 0;
      int directioning = 0;
      int r = 0;
      ArrayList<Integer> a = new ArrayList<Integer>();
      ArrayList<Integer> b = new ArrayList<Integer>();
      int x = 0;
      int y = 0;
      File file = new File("directions.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        String direction = input.next();
        direction = direction.replaceAll(",", "");
        if ((direction.charAt(0)) == ('L')){
          directioning --;
        }
        else if ((direction.charAt(0)) == ('R')){
          directioning ++;
        }
        while (directioning<0){
          directioning += 4;
        }
        distance = Integer.valueOf(direction.substring(1, direction.length()));
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
        a.add(x);
        b.add(y);
        System.out.println(a.get(a.size()-1));
        System.out.println(b.get(b.size()-1));
        for (int i = 0; i<a.size()-1; i++){
          if((a.get(a.size()-1) == a.get(i)) && (b.get(b.size()-1) == b.get(i))){
            r = x+y;
            System.out.println(r);
          }
        }
      }
      System.out.println("The steps in x direction is " + x);
      System.out.println("The steps in y direction is " + y);
      int z = x+y;
      System.out.println("The distance is " + z);
      System.out.println("The first location you visit twice is " + r + " units away");
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
