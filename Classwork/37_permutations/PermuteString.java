public class PermuteString{
  public static void main (String[] args){
    permute("ABC", 0);
  }
  public static void permute(String str, int l){
    if (l = str.length()-1){
      System.out.println(str);
    }
    else{
      for(int i = 0; i < str.length();i++){
        String temp = "";
        permute(str.substring(l+1) + str.charAt(i), l+1);
      }
    }
  }
}
