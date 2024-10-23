public class Driver{
  public static void main (String[] args){
    SuperArray s = new SuperArray(7);
    s.add("hi there");
    s.add("bye");
    s.add("lies");
    s.add("truths");
    s.add("sleep");
    System.out.print(s);
    System.out.print(s.toString());
    System.out.print(s.get(3));
    s.set(2, "happy");
    System.out.print(s);
    s.remove(0);
    System.out.print(s);
    s.remove("bye");
    System.out.print(s);
  }
}
      
