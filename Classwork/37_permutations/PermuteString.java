public class PermuteString{
  public static void main (String[] args){
    permute("ABC", 0);
  }
  public static void permute(String str, int l){
    if (str==0){
      System.out.println(str);
    }
    else{
      for(int i = 0; i < str.length();i++){
        permute(str + str.substring(i,i+1)), l-1);
      }
    }
  }
}
