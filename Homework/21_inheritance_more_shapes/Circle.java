public class Circle{
  private double radius;
  public Circle(double radius){
    this.radius = radius;
  }
  public double getRadius(){
    return radius;
  }
  public String toString(){
    return "This is a circle with radius " + this.getRadius() ;
  }
  public double getArea(){
    area = Math.PI*this.getRadius()*this.getRadius();
    return area;
  }
}
