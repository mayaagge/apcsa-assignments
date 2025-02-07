public class PermuteString{
  public static void main (String[] args){
    String str = "ABC";
    permute(str, 0);
  }
  public static void permute(String str, int l){
    if (l == str.length()-1){
      System.out.println(str);
    }
    else{
      for(int i = 1; i < str.length();i++){
        String temp = str.substring(0, l) + str.charAt(i);
        if (l + 1 < i) {
          temp += str.substring(l + 1, i);
        }
        temp += str.charAt(l);
        if (i + 1 < str.length()) {
          temp += str.substring(i + 1);
        }
        permute(temp, l+1);
      }
    }
  }
}
