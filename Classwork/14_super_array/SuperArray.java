public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[0];
    size = 0;
  }
  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new IllegalArgumentException("Initial Capacity must be positive");
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
    else {
      resize();
      data[size] = value;
      size += 1;
      return false;
    }
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
  private void resize(){
    String[] s = new String[2*data.length + 1];
    if (data.length == 0){
      s[0] = null;
    }
    for (int i = 0; i < data.length; i++){
      s[i] = data[i];
    }
    data = s;
  }
  public int indexOf(String target){
    for (int i = 0; i < data.length; i++){
      if (data[i] == null){
        return -1;
      }
      else if (data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String target){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i] == null){
        break;
      }
      else if (data[i].equals(target)){
        count = i;
      }
    }
    if (count == 0){
      return -1;
    }
    return count;
  }
  public void add(int index, String value){
    int count = 0;
    if (size == data.length && size !=0){
      this.add(data[data.length-1]);
      count += 1;
    }
    else if (size == data.length && size == 0){
      this.add(null);
    }
    if (index < 0 || index >= size){
      System.out.print("Error! Check index.");
    }
    for(int i=data.length-1; i >= index; i--){
      if (i == 0){
          data[i] = null;
      }
      else{
        data[i] = data[i-1];
      }
    }
    data[index] = value;
    if (count == 1){
      this.remove(data[size-1]);
    }
    System.out.println(this);
  }
}
