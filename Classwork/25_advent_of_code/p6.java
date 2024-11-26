import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections; 

public class p6{
  public static void main(String[] args){
    readFile();
  }
  public static void readFile(){
    try{
      String b1 = "";
      String b2 = "";
      String b3 = "";
      String b4 = "";
      String b5 = "";
      String b6 = "";
      String b7 = "";
      String b8 = "";
      String b9 = "";
      ArrayList<Integer> a1 = new ArrayList<Integer>();
      ArrayList<Integer> a2 = new ArrayList<Integer>();
      ArrayList<Integer> a3 = new ArrayList<Integer>();
      ArrayList<Integer> a4 = new ArrayList<Integer>();
      ArrayList<Integer> a5 = new ArrayList<Integer>();
      ArrayList<Integer> a6 = new ArrayList<Integer>();
      ArrayList<Integer> a7 = new ArrayList<Integer>();
      ArrayList<Integer> a8 = new ArrayList<Integer>();
      ArrayList<Integer> a9 = new ArrayList<Integer>();
      File file = new File("words.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        String word = input.next();
        a1.add(word[0]);
        a2.add(word[1]);
        a3.add(word[2]);
        a4.add(word[3]);
        a5.add(word[4]);
        a6.add(word[5]);
        a7.add(word[6]);
        a8.add(word[7]);
        a9.add(word[8]);
        Collections.sort(a1);
        Collections.sort(a2);
        Collections.sort(a3);
        Collections.sort(a4);
        Collections.sort(a5);
        Collections.sort(a6);
        Collections.sort(a7);
        Collections.sort(a8);
        Collections.sort(a9); 
        String max1 = arr.get(a1.size() - 1); 
        String max2 = arr.get(a2.size() - 1); 
        String max3 = arr.get(a3.size() - 1); 
        String max4 = arr.get(a4.size() - 1); 
        String max5 = arr.get(a5.size() - 1); 
        String max6 = arr.get(a6.size() - 1); 
        String max7 = arr.get(a7.size() - 1); 
        String max8 = arr.get(a8.size() - 1); 
        String max9 = arr.get(a9.size() - 1); 
      }  
    System.out.println("The code is " + max1 + max2 + max3 + max4 + max5 + max6 + max7 + max8 +max9);
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
