public class MyStringMethods{

  // Explain how IndexOf method works in a few sentences: 
  //IndexOf works by returning the first index of the first charcter in the string given if it is in the string. If it is not in the string it return -1.
  // Then implement your own myIndexOf
  public static int myIndexOf(String myString, String targetString){
    for (int i = 0; i < myString.length(); i++)
    {
      if ((myString.substring(i,i+targetString.length())).equals(targetString))
      {
        return i;
      }
    }
    return -1;
  }   

  // Explain how CompareTo method works in a few sentences: compareTo return 0 when equals(x) returns true, but if the strings are different at different index positions then it returns the difference of the ascii values of the characters at those indices. If there is no index postion for which the strings are different then it subtracts the lengths. 
  // Then implement your own myCompareTo
  public static int myCompareTo(String myString, String otherString){
    if (myString.equals(otherString))
    {
      return 0;
    }
    else if (myString.length() <= otherString.length())
      for (int i = 0; i < myString.length(); i++)
      {
        if (!(myString.substring(i,i+1)).equals(otherString.substring(i,i+1)))
        {
          return (myString.charAt(i)-otherString.charAt(i));
        }
      }
    else if (otherString.length() <= myString.length())
      for (int i = 0; i < otherString.length(); i++)
      {
        if (!(myString.substring(i,i+1)).equals(otherString.substring(i,i+1)))
        {
          return (myString.charAt(i)-otherString.charAt(i));
        }
      }
    return myString.length()-otherString.length();
  }

  // Explain how parseInt method works in a few sentences: parseInt makes the string into a signed decimal integer.
  // Then implement your own myParseInt()
 public static int myparseInt(String myString){
   int a = 0;
   int b = 0;
    for (int i = 0; i < myString.length(); i++)
    {
      a = (int) (myString.charAt(i)-48);
      b += a*Math.pow(10, myString.length()-i);
    }
   return b;
 }

  public static void main(String[] args)
  {
    System.out.println(myIndexOf("hello", "ll"));
    System.out.println("hello".indexOf("ll"));
    System.out.println(myIndexOf("Maya", "a"));
    System.out.println("Maya".indexOf("a"));
    System.out.println(myCompareTo("Maya", "Mama"));
    System.out.println("Maya".compareTo("Mama"));
    System.out.println(myCompareTo("Hello", "Hello!"));
    System.out.println("Hello".compareTo("Hello!"));
    System.out.println(myCompareTo("bye", "bye"));
    System.out.println("bye".compareTo("bye"));
    System.out.println(myparseInt("34")); 
    System.out.println(Integer.parseInt("34"));
    System.out.println(myparseInt("7"));
    System.out.println(Integer.parseInt("7"));
  }
}
