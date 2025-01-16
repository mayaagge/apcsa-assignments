public class BinarySearch{
  public static int binarySearch(int[] arr, int low, int high, int target){
    if (arr[(low+high)/2] < target){
      return binarySearch(arr, (low+high)/2 + 1, high, target);
    }
    else if (arr[(low+high)/2] > target){
      return binarySearch(arr, low, (low+high)/2-1, target);
    }
    return (low+high)/2;
  }
  public static void main(String[] args){
    int[] l1 = new int[] {1,2,3,4,5,6,7,8,9,15};
    System.out.println(binarySearch(l1, 0, 9, 1));
  }
}
