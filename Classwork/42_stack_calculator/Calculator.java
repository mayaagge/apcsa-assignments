import java.util.ArrayDeque;
public class Calculator{
  public static double eval(String expression){
    ArrayDeque<Double> s = new ArrayDeque<>();
    String[] arr = expression.split(" ");
    int count = 0;
    for (int i = 0; i < arr.length; i++){
      if (Double.parseDouble(arr[i])  != ("+" && "-" && "*" && "/")){
        s.push(Double.parseDouble(arr[i]));
        count += 1;
      }
      else{
        for (int j = i; j < count; j--){
          s.pop(Double.parseDouble(arr[j]));
        }
      } 
    }
  }
}
