public class Shape{
    private double height;
    private double width;
    public Shape(double newHeight, double newWidth){
        height = newHeight;
        width = newWidth;
    }
    public Shape(){

    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double hHeight){
        height = hHeight;
    }
    public void setWidth(double wWidth){
        width = wWidth;
    }
}