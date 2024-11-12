public class Driver {
    public static void main(String[] args){
        Shape myShape = new Shape(3,4);
        Triangle myTriangle = new Triangle(3,4);
        Rectangle myRectangle = new Rectangle(3,4);
        System.out.println("The height of the shape is: " + myShape.getHeight() + " and the width of the shape is: " + myShape.getWidth());
        System.out.println("Area triangle: " + myTriangle.getArea());
        System.out.println("Area rectangle: " + myRectangle.getArea());
    }
}
