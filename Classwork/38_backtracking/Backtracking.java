public class Backtracking{
  public static boolean groupSum(int start, int[] nums, int target){
    if(start >= nums.length){
      if (target == 0){
        return true;
      }
      return false;
    }
    boolean a = true;
    if (a == true){
      nums[0] = 0
      groupSum(start + 1, nums, target);
      a = false;
    }
  }
  
