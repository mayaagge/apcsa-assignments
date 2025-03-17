public class Stack{
  // This Stack class is designed for integer values >= 0

  // Instance variables here
  private Node head;
  private int size;

 // Constructor
  public Stack(){
    size = 0;
    head = null;
  }   

  // Add element to stack
  public void push(int value){
    size += 1;
    Node a = new Node(value);
    if (head == null){
      head = a;
    }
    else{
      a.setNext(head);
      head = a;
    }
  }

  // Remove element from stack  
  public int pop(){
    size -= 1;
    Node curr = head.getData();
    head = head.getNext();
    return curr;
  }

  // Get top element
  public int peek(){
    return head.getData();
  }

  // Check is stack empty
  public boolean isEmpty(){
    if (head == null){
      return true;
    }
    return false;
  }

  // Return size stack
  public int size(){
    return size;
  }

  // Print stack
  public String toString(){
    Node a = head;
    if (a == null){
      return "[]";
    }
    String d = "[" + a.toString(); 
    a = a.getNext();
    while(a != null){
      d += a.toString();
      a = a.getNext();
    }
    d += "]";
    return d;
  }


}
