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
    System.out.println("The fourth element of this superArray is: " + s.get(3));
    s.set(2, "happy");
    System.out.println("Set the third element of this superArray to happy: " + s);
    System.out.println(s.remove(0));
    System.out.println("Remove the first element of this superArray: " + s);
    s.remove("bye");
    System.out.println("Remove bye from this superArray: " + s);
    s.remove("sleep");
    System.out.println("Remove sleep from this superArray: " + s);
    SuperArray s1 = new SuperArray(3);
    SuperArray s2 = new SuperArray(4);
    s1.add("be");
    s1.add("bad");
    s1.add("down");
    s2.add("m");
    s2.add("a");
    s2.add("y");
    s2.add("a");
    System.out.println(s1);
    s1.remove(2);
    System.out.println("Remove the last element of this superArray: " + s1);
    s1.set(2, "ever");
    System.out.println("Set the last element of this superArray to never: " + s1);
    s1.remove("bad");
    System.out.println("Remove bad from this superArray: " + s1);
    System.out.println(s2);
    s2.remove(2);
    System.out.println("Remove the third element of this superArray: " + s2);
    s2.set(3, "7");
    System.out.println("Set the last element of this superArray to 7: " + s2);
    SuperArray s3 = new SuperArray(0);
    System.out.println(s3.toString());
    SuperArray s4 = new SuperArray(-5);
  }
}
      
      
