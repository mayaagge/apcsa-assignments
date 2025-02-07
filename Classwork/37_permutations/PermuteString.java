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
        str = swap(str, l, i);
        permute(str, l+1);
        str = swap(str, l, i);
      }
    }
  }
  public static String swap(String str, int l1, int l2) {
    return str.substring(0, l1) + str.charAt(l2) +
    str.substring(l1 + 1, l2) + str.charAt(l1) +
     str.substring(l2 + 1);
    /*
    char[] a = str.toCharArray();
    char temp = a[l1];
    a[l1] = a[l2];
    a[l2] = temp;
    String b = new String(a);
    return b;
    */
  }
}
