public class MyStringMethods{

  // Explain how IndexOf method works in a few sentences: 
  //IndexOf works by returning the first index of the first charcter in the string given if it is in the string. If it is not in the string it return -1.
  // Then implement your own myIndexOf
  public static int myIndexOf(String myString, String targetString){
    for (int i = 0; i < myString.length(); i++)
    {
      if ((myString.substring(i,i+1)).equals(targetString))
      {
        return i;
      }
    }
    return -1;
  }   

  // Explain how CompareTo method works in a few sentences: compareTo return 0 when equals(x) returns true, but if the strings are different at different index positions then it returns the difference of the ascii values of the characters at those indices. If there is no index postion for which the strings are different then it subtracts the lengths. 
  // Then implement your own myCompareTo
  public static int myCompareTo(String myString, String otherString){
    return 0;
  }

  // Explain how parseInt method works in a few sentences: parseInt makes the string into a signed decimal integer.
  // Then implement your own myParseInt()
 public static int myparseInt(String myString){
    return 0;
 }

  public static void main(String[] args)
  {
    System.out.println(myIndexOf("hello", "el"));
    System.out.println(myIndexOf("Maya", "a"));
  }
}
