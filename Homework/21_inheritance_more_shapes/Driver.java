public class Driver{
  public static void main(String[] args){
    Circle c1 = new Circle(4);
    Cylinder d1 = new Cylinder(4, 5);
    System.out.println("The Circle's radius is " + c1.getRadius());
    System.out.println("The Circle's area is " + c1.getArea());
    System.out.println(c1.toString());
    System.out.println("The Cylinder's radius is " + d1.getRadius());
    System.out.println("The Cylinder's height is " + d1.getHeight());
    System.out.println("The Cylinder's surface area is " + d1.getArea());
    System.out.println("The Cylinder's volume is " + d1.getVolume());
    System.out.println(d1.toString());
  }
}
