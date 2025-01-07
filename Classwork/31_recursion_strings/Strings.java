public class Strings{
  public static void printString(String word){
    if (word.equals(""){
     ;
    }
    System.out.println(word.charAt(0));
    printString(word.substring(1));
  }
  public static void main (String[] args){
    printString("maya");
  }
}
