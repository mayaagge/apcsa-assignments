import java.util.ArrayDeque;
public class Calculator{
  public static void main (String[] args){
    String c = "11 3 - 4 + 2.5 *";
    eval(c);
  }
  public static double eval(String expression){
    ArrayDeque<Double> s = new ArrayDeque<>();
    String[] arr = expression.split(" ");
    int count = 0;
    for (int i = 0; i < arr.length; i++){
      if ((arr[i]  != "+") && (arr[i]  != "*") && (arr[i]  != "-") && (arr[i]  != "/")){
        s.push(Double.parseDouble(arr[i]));
        count += 1;
        s.toString();
      }
      else{
        for (int j = i; j < count; j--){
          s.pop();
        }
      } 
    }
    return s.pop();
  }
}
