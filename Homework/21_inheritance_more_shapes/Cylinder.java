public class Cylinder extends Circle{
  private double height;
  public Cylinder(radius, height){
    super(radius);
    this.height = height;
  }
  public double getHeight(){
    return height;
  }
  public double getVolume(){
    volume = Math.PI* super.getRadius()*super.getRadius()*this.getHeight();
    return volume;
  }
  //Override
  public double getArea(){
    sa = super.getArea()*2*this.getHeight();
    return sa;
  }
  //Override
  public String toString(){
    return "Cylinder " + super.getRadius() + ", " + this.getHeight();
  }
}
