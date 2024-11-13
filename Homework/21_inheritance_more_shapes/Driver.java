public class Driver{
  public static void main(String[] args){
    Circle c1 = new Circle(4);
    Cylinder d1 = new Cylinder(4, 5);
    System.out.println("The Circle's radius is " + Circle.getRadius());
    System.out.println("The Circle's area is " + Circle.getArea());
    System.out.println(Circle.toString());
    System.out.println("The Cylinder's radius is " + Cylinder.getRadius());
    System.out.println("The Cylinder's height is " + Cylinder.getHeight());
    System.out.println("The Cylinder's surface area is " + Cylinder.getArea());
    System.out.println("The Cylinder's volume is " + Cylinder.getVolume());
    System.out.println(Cylinder.toString());
  }
}
