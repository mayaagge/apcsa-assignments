import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
import java.util.Arrays;
import java.util.ArrayList;

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
      int max = Integer.MIN_VALUE;
      int count = 0;
      for (String a : a1) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b1 = count;
      }
      max = Integer.MIN_VALUE;
      count = 0;
      for (String a : a2) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b2 = count;
      }
      max = Integer.MIN_VALUE;
      count = 0;
      for (String a : a3) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b3 = count;
      }
      max = Integer.MIN_VALUE;
      count = 0;
      for (String a : a4) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b4 = count;
      }
      max = Integer.MIN_VALUE;
      count = 0;
      for (String a : a5) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b5 = count;
      }
      max = Integer.MIN_VALUE;
      count = 0;
      for (String a : a6) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b6 = count;
      }
      max = Integer.MIN_VALUE;
      count = 0;
      for (String a : a7) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b7 = count;
      }
      max = Integer.MIN_VALUE;
      count = 0;
      for (String a : a8) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b8 = count;
      }
      max = Integer.MIN_VALUE;
      count = 0;
      for (String a : a9) {
        if (a.compareTo(max) > 0) {
            max = a;
            count = 1;
        } else if (a == max) {
            ++count;
        }
        b9 = count;
      }
    }
      System.out.println("The code is " + b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 +b9);
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
