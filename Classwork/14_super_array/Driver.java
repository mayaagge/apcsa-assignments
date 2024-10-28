public class Driver{
  public static void main (String[] args){
    SuperArray s = new SuperArray(5);
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
    System.out.println("The index of bye in this superArray is " + s.indexOf("bye"));
    System.out.print("Add life at the 0th index: ");
    s.add(0,"life");
    System.out.print("Add peace at the 4th index: ");
    s.add(4,"peace");
    s.remove(0);
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
    System.out.println("The index of be in this superArray is " + s1.indexOf("be"));
    System.out.println("The last index of bad in this superArray is " + s2.lastIndexOf("bad"));
    System.out.println("The last index of hi in this superArray is " + s2.lastIndexOf("hi"));
    s1.set(2, "ever");
    System.out.println("Set the last element of this superArray to never: " + s1);
    s1.remove("bad");
    System.out.println("Remove bad from this superArray: " + s1);
    System.out.print("Add the best at the 0th index: ");
    s1.add(0,"the best");
    System.out.println(s2);
    s2.remove(2);
    System.out.println("Remove the third element of this superArray: " + s2);
    s2.set(3, "7");
    System.out.println("Set the last element of this superArray to 7: " + s2);
    s2.add("3");
    System.out.println("Add another element, 3, to this superArray: " + s2);
    s2.add("4");
    System.out.println("Add another element, 4, to this superArray: " + s2);
    System.out.println("The index of 7 in this superArray is " + s2.indexOf("7"));
    System.out.println("The index of 5 in this superArray is " + s2.indexOf("5"));
    System.out.println("The last index of a in this superArray is " + s2.lastIndexOf("a"));
    System.out.print("Add meow at the 1st index: ");
    s2.add(1,"meow");
    SuperArray s3 = new SuperArray(0);
    System.out.println(s3.toString());
    s3.add("bro");
    System.out.println("Add bro at the 0th index: " + s3);
    System.out.println("The last index of meow in this superArray is " + s3.lastIndexOf("meow"));
    System.out.print("Add dead at the 0th index: ");
    s3.add(0,"dead");
    SuperArray s4 = new SuperArray(0);
    System.out.print("Add BYE at the 0th index: ");
    s4.add(0,"BYE");
    SuperArray s4 = new SuperArray(-5);
  }
}
      

      
      
