public class Frontier{
  private ArrayDeque<int[]> frontier; // Replace ? with the type you want for your frontier
  public Frontier(){
    frontier = new ArrayDeque<int[]>();
  }
  public int size(){
    return frontier.size();
  }
  public void add(int[]location){
    frontier.enqueue(location);
  }
  public int[] remove(){
    return frontier.dequeue();
  }
}
