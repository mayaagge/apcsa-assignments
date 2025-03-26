import java.util.ArrayDeque;
public class Calculator{
  public static void main (String[] args){
    String c = "11 3 - 4 + 2.5 *";
    System.out.println(eval(c));
  }
  public static double eval(String expression){
    ArrayDeque<Double> s = new ArrayDeque<>();
    String[] arr = expression.split(" ");
    int count = 0;
    for (int i = 0; i < arr.length; i++){
      if (!((arr[i].equals("+")) || (arr[i].equals("*")) || (arr[i].equals("-")) || (arr[i].equals("/")))){
        System.out.println(arr[i]);
        s.push(Double.parseDouble(arr[i]));
        count += 1;
        s.toString();
      }
      else{
        double a = s.pop();
        if (arr[i] == "+"){
          a += s.pop();
        }
        if (arr[i] == "-"){
          a -= s.pop();
        }
        if (arr[i] == "*"){
          a *= s.pop();
        }
        if (arr[i] == "/"){
          a /= s.pop();
        }
        count = 0;
      } 
    }
    return s.pop();
  }
}
