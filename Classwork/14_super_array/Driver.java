public class Driver{
  public static void main (String[] args){
    SuperArray s = new SuperArray(7);
    s.add("hi there");
    s.add("bye");
    s.add("lies");
    s.add("truths");
    s.add("sleep");
    System.out.println(s);
    System.out.println(s.toString());
    System.out.println(s.get(3));
    s.set(2, "happy");
    System.out.println(s);
    s.remove(0);
    System.out.println(s);
    s.remove("bye");
    System.out.println(s);
  }
}
      
