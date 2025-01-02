public class SumArrayRecursion{
  public static int sumArray(int[] nums, int index){
    if (index == -1){
      return 0;
    }
    return sumArray(nums, index-1) + nums[index];
  }
  public static void main(String[] args){
    int[] n1 = new int[] {1,2,3};
    int[] n2 = new int[] {1};
    System.out.println(sumArray(n1,2));
    System.out.println(sumArray(n2, 0));
  }
}
