public class Extremes
{
    Integer min;
    Integer max;
    
    // Constructor
    public Extremes()
    {
      min = Integer.MIN_VALUE;
      max = Integer.MAX_VALUE;
      //Set min and max values 
    }
    
    // Returns the difference
    // max - number
    public Integer maxDiff(Integer number)
    {
      int md = Math.abs(max - number);
      return md;
    }

    // Returns the difference
    // min - number
    public Integer minDiff(Integer number)
    {
      int mi = Math.abs(min - number);
      return mi;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}
