public class Rectangle extends Shape{
    public Rectangle(double newHeight, double newWidth){
        super(newHeight, newWidth);
    }
    public double getArea(){
        double area = super.getHeight()*super.getWidth();
        return area;
    }
}
