public class Strings{
  public static void printString(String word){
    if (word.length()<1){
     System.out.println(word);
    }
    else{ 
      System.out.println(word.charAt(0));
      printString(word.substring(1));
    }
  }
  public static void printReverse(String word){
    if (word.length()<1){
      System.out.println(word.charAt(0));
    }
    System.out.println(word.charAt(word.length()-1));
    printReverse(word.substring(0,word.length()-1));
  }
  public static int countChar(String word, char ch){
    if(word.length()<1){
      return 0;
    }
    else if(word.charAt(0) == ch){
      return 1 + countChar(word.substring(1),ch);
    }
    return countChar(word.substring(1), ch);
  }
  public static void main (String[] args){
    printString("maya");
    printReverse("maya");
    countChar("maya", 'a');
  }
}
