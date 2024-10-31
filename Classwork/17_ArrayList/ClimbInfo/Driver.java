public class Driver{
     public static void main(String[] args)
     {
          ClimbingClub hikerClub = new ClimbingClub();
          hikerClub.addClimb("Monadnock", 274);
          hikerClub.addClimb("Whiteface", 301);
          hikerClub.addClimb("Algonquin", 225);
          hikerClub.addClimb("Monadnock", 344);
          hikerClub.printNames();
          int numNames = hikerClub.distinctPeakNames();
          System.out.println(numNames);
          climbingClub climb2 = new ClimbingClub();
          climb2.addClimb("A", 305);
          climb2.addClimb("A", 273);
          climb2.addClimb("B", 274);
          climb2.addClimb("B", 301);
          climb2.addClimb("C", 225);
          climb2.addClimb("C", 344);
          climb2.printNames();
          int numNames2 = climb2.distinctPeakNames();
          System.out.println(numNames2);
         // YOUR CODE HERE
     }
 }
