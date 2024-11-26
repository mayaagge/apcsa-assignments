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
      String max1 = "";
      String max2 = "";
      String max3 = "";
      String max4 = "";
      String max5 = "";
      String max6 = "";
      String max7 = "";
      String max8 = "";
      String max9 = "";
      ArrayList<String> a1 = new ArrayList<String>();
      ArrayList<String> a2 = new ArrayList<String>();
      ArrayList<String> a3 = new ArrayList<String>();
      ArrayList<String> a4 = new ArrayList<String>();
      ArrayList<String> a5 = new ArrayList<String>();
      ArrayList<String> a6 = new ArrayList<String>();
      ArrayList<String> a7 = new ArrayList<String>();
      ArrayList<String> a8 = new ArrayList<String>();
      ArrayList<String> a9 = new ArrayList<String>();
      File file = new File("words.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        String word = input.next();
        a1.add(Character.toString(word.charAt(0)));
        a2.add(Character.toString(word.charAt(1)));
        a3.add(Character.toString(word.charAt(2)));
        a4.add(Character.toString(word.charAt(3)));
        a5.add(Character.toString(word.charAt(4)));
        a6.add(Character.toString(word.charAt(5)));
        a7.add(Character.toString(word.charAt(6)));
        a8.add(Character.toString(word.charAt(7)));
        a9.add(Character.toString(word.charAt(8)));
        Collections.sort(a1);
        Collections.sort(a2);
        Collections.sort(a3);
        Collections.sort(a4);
        Collections.sort(a5);
        Collections.sort(a6);
        Collections.sort(a7);
        Collections.sort(a8);
        Collections.sort(a9); 
        max1 = a1.get(a1.size() - 1); 
        max2 = a2.get(a2.size() - 1); 
        max3 = a3.get(a3.size() - 1); 
        max4 = a4.get(a4.size() - 1); 
        max5 = a5.get(a5.size() - 1); 
        max6 = a6.get(a6.size() - 1); 
        max7 = a7.get(a7.size() - 1); 
        max8 = a8.get(a8.size() - 1); 
        max9 = a9.get(a9.size() - 1); 
      }  
    System.out.println("The code is " + max1 + max2 + max3 + max4 + max5 + max6 + max7 + max8 +max9);
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
