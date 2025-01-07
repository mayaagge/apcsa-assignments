public class Strings{
  public static void printString(String word){
    if (word.length() < 1){
      System.out.print(word);
    }
    System.out.print(word.charAt(0) + printString(word.substring(1)));
  }
  public static void main (String[] args){
    printString("maya");
  }
}
