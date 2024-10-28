public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[0];
    size = 0;
  }
  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new Exception(IllegalArgumentException);
    }else{
      data = new String[initialCapacity];
      size = 0;
    }
  }
  public int size(){
    return size;
  }
  public boolean add(String value){
    if (data.length > size){
      data[size] = value;
      size += 1;
      return true;
    }
    return false;
  }
  public String toString(){
    if (data.length == 0){
      return "[]";
    }
    String s = "[" + data[0];
    for (int i =1; i< data.length; i++){
      s += ", " + data[i];
    }
    return s + "]";
  }
  public String get(int index){
    if (index < 0 || index >= size){
      return null;
    }
    return data[index];
  }
  public String set(int index, String newValue){
    if (index < 0 || index >= size){
      return null;
    }
    String temp = data[index];
    data[index] = newValue;
    return temp;
    }
  public String remove(int index){
    if (index < 0 || index >= size){
      return null;
    }
    data[index] = null;
    String temp = data[index];
    for(int i=0; i< data.length-1; i++){
      if (i >= index){
        data[i] = data[i+1];
      }
    }
    data[data.length-1] = null;
    return temp;
  }
  public boolean remove(String target){
    for (int i = 0; i < data.length; i++){
      if (data[i] == null){
        return false;
      }
      if (data[i].equals(target)){
        String a = this.remove(i);
        if (a!= null){
          return true;
        }
      }
    }
    return false;
  }
}
