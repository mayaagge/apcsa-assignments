public class MyArrayPractice{
  public static void main (String[] args){
    int[][] m = {{-1,-2,4},{4,-3,6,-7,8},{9,2},{777,7,7}};
    int[][] s = {{},{},{},{}};
    int[][] n = {{1,2},{3,4}};
    print(copy(m));
    print(updateValues(m));
    print(copy(n));
    print(updateValues(n));
    print(copy(s));
    print(updateValues(s));
  }
  public static int[][] copy(int[][] nums){
    int[][] newArray = nums.clone();
    return newArray;
  }
  public static int[][] updateValues(int[][] nums){
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        if (nums[i][x] < 0){
          if (i == x){
            nums[i][x] = 0;
          }
          else {
            nums[i][x] = 1;
          }
        }
      }
    }
    return nums;
  }
  public static void print(int[][] bruh){
    for (int i = 0; i < bruh.length; i++) {
      for (int x = 0; x < bruh[i].length; x++) {
        System.out.print(bruh[i][x] + ", ");
      }
    }
  }
}
          
          
