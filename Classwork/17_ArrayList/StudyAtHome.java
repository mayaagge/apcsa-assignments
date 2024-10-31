import java.util.ArrayList;

public class StudyAtHome
{
   public static void main(String[] args)
   {
      // YOU MAY REMOVE MY CODE FOR ARRAY AFTER YOU CREATE YOUR ARRAYLIST.
      
       // Rewrite this code using an ArrayList instead of an array
       ArrayList<String> a = new ArrayList<String>();
       a.add("Review the lessons");
       a.add("Drink the water");
       a.add("Work on the lab");
       System.out.println(a);

       // changing element 1
       a.set(1,"Do homework");
       System.out.println(a);

       System.out.println(a.size() + " things to do!");
       System.out.println("Here's the first thing to do: " + a.get(0));

       // remove item 0 and move everything down
       // (this can be done in 1 line with ArrayList)
        a.remove(0);
        System.out.println("Here's the next thing to do: " + a.get(0));

   }
}
