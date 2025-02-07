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
        String temp = "";
        if (i + 1 < str.length()){
          temp = str.substring(0,1) + str.charAt(i) + str.substring(l+1,i) + str.charAt(1) + str.substring(i);
        }
        else{
          temp = str.substring(0,1) + str.charAt(i) + str.substring(l+1,i) + str.charAt(1);
        }
        permute(temp, l+1);
      }
    }
  }
}
