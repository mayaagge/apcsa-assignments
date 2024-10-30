public class Driver{
     public static void main(String[] args)
     {
     	 // Array of strings
          String[] words = {"Hi", "there", "Tyler", "Sam", "Hi", "there"};
         
         // Create an ArrayList with words pairs
          WordPairList list = new WordPairList(words);
         
         // Print the list
          //System.out.println(list);
          listArrayPrint(list);
         
         // Print number of matched pairs
          System.out.println("The number of matched pairs is: " + list.numMatches());
         
         // ADD MORE TEST CASES (at least 2 more)
          String[] words1 = {"Hi", "Hi"};
          String[] words2 = {"Hi"};
          String[] words3 = {};
          String[] words4 = {"hi", "bye"};
          WordPairList list1 = new WordPairList(words1);
          WordPairList list2 = new WordPairList(words2);
          WordPairList list3 = new WordPairList(words3);
          WordPairList list4 = new WordPairList(words4);
          //System.out.println(list1);
          listArrayPrint(list1);
          System.out.println("The number of matched pairs is: " + list1.numMatches());
          //System.out.println(list2);
          listArrayPrint(list2);
          System.out.println("The number of matched pairs is: " + list2.numMatches());
          //System.out.println(list3);
          listArrayPrint(list3);
          System.out.println("The number of matched pairs is: " + list3.numMatches());
          //System.out.println(list4);
          listArrayPrint(list4);
          System.out.println("The number of matched pairs is: " + list4.numMatches());
     }
     public static void listArrayPrint(WordPairList a){
          System.out.print("{");
          for (WordPair pair: a){
               System.out.print(print + ",");
          }
          System.out.print("}");
      }
}
