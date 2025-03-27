import java.util.ArrayDeque;
public class Calculator{
  public static void main (String[] args){
    System.out.println(eval("11 3 - 4 + 2.5 *"));
    System.out.println(eval("21 4.0 +"));
    System.out.println(eval("8 2 + 99 9 - * 2 + 9 -"));
    System.out.println(eval("1 2 3 4 5 + * - -" ));
    System.out.println(eval("15.6 3.7 5.9 7.1 18.7 - + - +"));
    System.out.println(eval("100"));
    System.out.println(eval("32.0 20.0 18 % 8 * /"));
    try {
      System.out.println(eval(""));
    } catch (IllegalArgumentException e) {
      System.out.println(e);
    }
    try {
      System.out.println(eval("1 1 1 +"));
    } catch (IllegalArgumentException e) {
      System.out.println(e);
    }
    try {
      System.out.println(eval("1 1 1 - * +"));
    } catch (IllegalArgumentException e) {
      System.out.println(e);
    }
    System.out.println(eval("19.7 4.4 13.7 8.9 * * 6.0 4.1 / * 7.1 - - 8.6 9.9 14.2 + - 8.5 2.8 - - 0.1 / 12.3 / 14.6 15.2 18.3 / 11.3 6.9 + / / / 10.1 18.8 9.0 / 5.6 / / - 9.0 4.4 + 3.3 14.1 4.8 + / 6.8 0.7 1.5 + + 6.4 - / + 3.9 3.7 15.5 * 5.7 12.0 + 8.3 * - 14.6 13.1 / 10.4 / + - * 16.7 5.4 - 12.1 * - / +"));
    System.out.println(eval("0.2 10.3 - 5.3 10.1 - - 7.7 9.3 1.4 + 16.6 - 0.7 + * 8.8 18.9 12.8 + 5.6 - 19.0 * 4.9 7.0 / * / / 11.8 1.3 10.7 0.7 18.4 / - / 18.9 / - / * 9.9 2.4 12.2 + / 17.1 11.9 10.9 * 19.0 * + 7.4 15.5 / + + 1.2 17.2 / 10.9 / 8.5 0.9 - 16.8 / - - + 7.0 5.6 / 16.6 19.0 / 9.3 3.8 6.2 * 18.5 / + * 17.9 0.3 1.8 / + 15.1 - 8.3 / 1.9 * * - 8.2 14.7 2.8 14.5 - / / 2.0 19.7 4.5 / + / + 2.8 17.7 8.0 10.1 18.8 - + / 11.5 / - - +"));
    System.out.println(infixToPostfix("5 * 4 + 2"));  
  }
  public static double eval(String expression){
    ArrayDeque<Double> s = new ArrayDeque<>();
    String[] arr = expression.split(" ");
    if (arr.length == 0 || (arr.length == 1 && arr[0].equals(""))) {
      throw new IllegalArgumentException("too few operands");
    }
    for (int i = 0; i < arr.length; i++){
      if (!((arr[i].equals("+")) || (arr[i].equals("*")) || (arr[i].equals("-")) || (arr[i].equals("/")) || arr[i].equals("%"))){
        s.push(Double.parseDouble(arr[i]));
      }
      else{
        if (s.size() < 2) {
          throw new IllegalArgumentException("too few operands for operation " + arr[i]);
        }
        double b = s.pop();
        double a = s.pop();
        double result = 0;
        if (arr[i].equals("+")){
          result = a + b;
        }
        else if (arr[i].equals("-")){
          result = a - b;
        }
        else if (arr[i].equals("*")){
          result = a * b;
        }
        else if (arr[i].equals("/")){
          result = a / b;
        }
        else if (arr[i].equals("%")) {
          result = a % b;
        }
        s.push(result);
      } 
    }
    if (s.size() > 1) {
      throw new IllegalArgumentException("too many operands");
    }
    return s.pop();
  }
  public static String infixToPostfix(String infix){
    ArrayDeque<String> s = new ArrayDeque<>();
    String[] arr = infix.split(" ");
    String postfix = "";
    for (int i = 0; i < arr.length; i++){
       if ((arr[i].equals("+")) || (arr[i].equals("*")) || (arr[i].equals("-")) || (arr[i].equals("/")) || arr[i].equals("%")){
         if ((arr[i].substring(0,1)).equals("(")){
           s.push(arr[i].substring(0,1));
         }
         else if ((arr[i].substring(0,1)).equals(")")){
           postfix += s.pop();
           s.pop();
         }  
         else{
          s.push(arr[i]);
         }
       }
      else{
        postfix += infix.substring(i, i+1);
        System.out.println(postfix);
      }
    }
    for (int i = 0; i < s.size(); i++){
      postfix += s.pop();
    }
    return postfix;
  }
}
