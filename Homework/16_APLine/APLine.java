public class APLine{
  //Instance variables
  private int a, b, c;

  // Constructors

  public APLine(int aVal, int bVal, int cVal){
    a = aVal;
    b = bVal;
    c = cVal;
  }
  
  public APLine(APLine other){
    this.a = other.a;
    this.b = other.b;
    this.c = other.c;
  }
  
  public APLine(){
  }

  public int getA(){
    return a;
  }

  public int getB(){
    return b;
  }

  public int getC(){
    return c;
  }

  public double getSlope(){
    return -a/b;
  }

  public boolean isOnLine(int x, int y){
    if (x*this.getA() + y*this.getB() + this.getC()) == 0 {
      return true;
    }
    else {
      return false;
    }
  }
}

  
  

  
