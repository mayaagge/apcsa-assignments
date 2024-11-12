public class Triangle extends Shape{
    public Triangle(double newHeight, double newWidth){
        super(newHeight, newWidth);
    }
    public double getArea(){
        double area = 0.5*super.getHeight()*super.getWidth();
        return area;
    }
}
