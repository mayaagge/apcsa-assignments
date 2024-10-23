public class Driver{
  public static void main (String[] args){
    SuperArray sup1 = new SuperArray(5);
    sup1.add("hi1");
    sup1.add("hi2");
    sup1.add("hi3");
    System.out.println(sup1);
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
    System.out.println(s.remove(0));
    System.out.println(s);
    s.remove("bye");
    System.out.println(s.remove("sleep"));
    System.out.println(s);
  }
}
      
