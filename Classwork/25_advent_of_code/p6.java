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
      String max1 = "";
      String max2 = "";
      String max3 = "";
      String max4 = "";
      String max5 = "";
      String max6 = "";
      String max7 = "";
      String max8 = "";
      String temp = "";
      int count = 1;
      int t = 0;
      ArrayList<String> a1 = new ArrayList<String>();
      ArrayList<String> a2 = new ArrayList<String>();
      ArrayList<String> a3 = new ArrayList<String>();
      ArrayList<String> a4 = new ArrayList<String>();
      ArrayList<String> a5 = new ArrayList<String>();
      ArrayList<String> a6 = new ArrayList<String>();
      ArrayList<String> a7 = new ArrayList<String>();
      ArrayList<String> a8 = new ArrayList<String>();
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
        Collections.sort(a1);
        Collections.sort(a2);
        Collections.sort(a3);
        Collections.sort(a4);
        Collections.sort(a5);
        Collections.sort(a6);
        Collections.sort(a7);
        Collections.sort(a8);

      }
      System.out.print(a1);
      for (int i = 1; i<a1.size(); i++){
        if ((a1.get(i)).equals(a1.get(i-1))==true){
          count += 1;
        }
        else{
          if (count > t){
            t = count;
            max1 = a1.get(i-1);
          }
          count = 1;
        }
      }
      System.out.println(count);
      System.out.println(max1);
      count =1;
      System.out.println(a1);
      for (int i = 1; i<a2.size(); i++){
        if (a2.get(i).equals(a2.get(i-1))){
          count += 1;
        }
        else{
          if (count > t){
            t = count;
            max2 = a2.get(i-1);
          }
          count = 1;
        }
      }
      System.out.println(count);
      System.out.println(max2);
      count =1;
      for (int i = 1; i<a3.size(); i++){
        if (a3.get(i).equals(a3.get(i-1))){
          count += 1;
        }
        else{
          if (count > t){
            t = count;
            max3 = a3.get(i-1);
          }
          count = 1;
        }
      }
      count =1;
      for (int i = 1; i<a4.size(); i++){
        if (a4.get(i).equals(a4.get(i-1))){
          count += 1;
        }
        else{
          if (count > t){
            t = count;
            max1 = a4.get(i-1);
          }
          count = 1;
        }
      }
      count =1;
      for (int i = 1; i<a5.size(); i++){
        if (a5.get(i).equals(a5.get(i-1))){
          count += 1;
        }
        else{
          if (count > t){
            t = count;
            max5 = a5.get(i-1);
          }
          count = 1;
        }
      }
      count =1;
      for (int i = 1; i<a6.size(); i++){
        if (a6.get(i).equals(a6.get(i-1))){
          count += 1;
        }
        else{
          if (count > t){
            t = count;
            max6 = a6.get(i-1);
          }
          count = 1;
        }
      }
      count =1;
      for (int i = 1; i<a7.size(); i++){
        if (a7.get(i).equals(a7.get(i-1))){
          count += 1;
        }
        else{
          if (count > t){
            t = count;
            max1 = a7.get(i-1);
          }
          count = 1;
        }
      }
      count =1;
      for (int i = 1; i<a8.size(); i++){
        if (a8.get(i).equals(a8.get(i-1))){
          count += 1;
        }
        else{
          if (count > t){
            t = count;
            max8 = a8.get(i-1);
          }
          count = 1;
        }
      }
    System.out.println( max1);
    System.out.println( max2);
    System.out.println( max3);
    System.out.println( max4);
    System.out.println( max5);
    System.out.println( max6);
    System.out.println( max7);
    System.out.println( max8);
    System.out.println("The code is " + max1 + max2 + max3 + max4 + max5 + max6 + max7 + max8);
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
