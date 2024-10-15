public class Point{
    // Instance variables

    private double x,y;

    // Constructors

    // Initialize this Point with the xVal and yVal parameters
    public Point(double xVal, double yVal){
        x = xVal;
        y = yVal;
    }

    // Initialize this Point with other Point's values
    public Point(Point other){
        // YOUR CODE HERE
        this.x = other.x;
        this.y = other.y;
    }

    // Getters

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    
    // Print the coordinate like this "(5.0, 3.0)"

    public String toString(){
        // YOUR CODE
        String coordinate = "(" + x + ", " + y + ")";
        return coordinate;
    }

    /*
    Write distance method
    */
    public static double distance(Point a, Point b){
        // YOUR CODE HERE
        double distancePoints = Math.exp(a*a + b*b, 1/2);
        return distancePoints;
    }

    /*
    The parameter list is different from distance method
    Do not duplicate your code
    Reuse code from prior methods
    */
    public double distanceTo(Point other){
        double d = distance(this, other);
        return d;
    }
}
