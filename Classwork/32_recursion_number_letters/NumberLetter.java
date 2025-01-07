public class NumberLetter{
  public static String numberToWords(int number) {
    String[] words = new String[] {"and", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred", "thousand"};
    if(number==1000){
      return "one thousand";
    }
    if(number>=100){
      return words[number/100] + " " + words[28] + " " + words[0] + " " + numbertoWords(number%100) 
    if(number>=20{
        if (number%10 == 0){
          return words[20+number/10-2)];
        }
        
    }
}
