import java.util.ArrayList;
public class ArrayListPractice{
  public static int listSumEvenIndexes(ArrayList<Integer> numsList){
    int count = 0;
    for (int i = 0; i<numsList.size(); i++){
      if (i % 2 == 0){
        count += numsList.get(i);
      }
    }
    return count;
  }
  public static ArrayList<String> listCatty(ArrayList<String> animalsList){
    ArrayList<String> s = "";
    for (int i = 0; i<animalsList.size(); i++){
      for (int a = 0; a<(animalsList.get(i)).length()-2; a++){
        if (((animalsList.get(i)).substring(a,a+3)).equals("cat")||((animalsList.get(i)).substring(a,a+3)).equals("Cat")){
          s.add(animalsList.get(i));
        }
      }
    }
    return s;
  }
  public static int listFairlyOddNums(ArrayList<Integer> numsList){
    int count = 0;
    for (int i = 0; i<numsList.size(); i++){
      if (i%2 == 0){
        if (numsList.get(i) != 0){
          count += numsList.get(i);
        }
      }
      else{
        if (numsList.get(i) == 0){
          count += numsList.get(i);
        }
      }
    }
    return count;
  }
  public static void main(String[] args){
    ArrayList<Integer> l1 = new ArrayList<Integer>();
    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);
    ArrayList<Integer> l2 = new ArrayList<Integer>();
    l2.add(8);
    l2.add(16);
    l2.add(10);
    ArrayList<Integer> l3 = new ArrayList<Integer>();
    l3.add(5);
    l3.add(0);
    l3.add(-10);
    ArrayList<String> s1 = new ArrayList<String>();
    s1.add("buffalo");
    s1.add("dog");
    ArrayList<String> s2 = new ArrayList<String>();
    s2.add("bobcat");
    s2.add("siamese cat");
    s2.add("catbird");
    ArrayList<String> s3 = new ArrayList<String>();
    s3.add("Cat");
    s3.add("frog");
    s3.add("mouse");
    ArrayList<Integer> l4 = new ArrayList<Integer>();
    l4.add(5);
    l4.add(0);
    l4.add(13);
    l4.add(51);
    listSumEvenIndexes(l1);
    listSumEvenIndexes(l2);
    listSumEvenIndexes(l3);
    listCatty(s1);
    listCatty(s2);
    listCatty(s3);
    listFairlyOddNums(l1);
    listFairlyOddNums(l2);
    listFairlyOddNums(l4);
  }
}
