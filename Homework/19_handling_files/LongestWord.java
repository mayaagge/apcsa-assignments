import java.util.Scanner;
public class LongestWord{
  public static void main(String[] args){

  }
  public static void readFile(){
    try{
      File file = newFile("my_text.txt");
      Scanner input = new Scanner(file);
      String l;
      while (input.hasnextLine()){
        String word = input.next();
        if (word.length() > l.length()){
          l = word;
        }
      }
    input.close();//releases the file from your program
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

}
