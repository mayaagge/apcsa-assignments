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
      for(int i = 0; i < str.length();i++){
        swap(str, l, i);
        permute(str, l+1);
        swap(str, l, i);
      }
    }
  }
  public static void swap(String str, int l1, int l2) {
    char temp = str.charAt(l1);
    str.charAt(l1) = str.charAt(l2);
     str.charAt(l2) = temp;
  }
}
