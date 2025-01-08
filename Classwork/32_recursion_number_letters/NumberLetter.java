public class NumberLetter{
  public static String numberToWords(int number) {
    String[] words = new String[] {"and", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred", "thousand"};
    if(number==1000){
      return "onethousand";
    }
    if(number>=100){
      if(number%100 == 0){
        return words[number/100] + words[28];
      }
      return words[number/100] + words[28] + words[0] + numberToWords(number%100);
    }
    if(number>=20){
        if (number%10 == 0){
          return words[20+(number/10-2)];
        }
        return words[20+(number/10-2)] + numberToWords(number%10);
    }
    return words[number];
  }
  public static void main(String[] args){
    int a = 0;
    for(int i = 0; i<=1000; i++){
      System.out.println(numberToWords(i));
      a += numberToWords(i).length();
    }
    System.out.println(a);
  }
}
