public class Stack{
  // This Stack class is designed for integer values >= 0
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Initial stack empty: " + stack.isEmpty()); // Expected: true
        System.out.println("Initial stack empty: " + stack.toString()); // Expected: []
        System.out.println("Initial stack size: " + stack.size()); // Expected: 0
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack.toString()); // Expected: 30 -> 20 -> 10 -> null
        System.out.println("Peek top: " + stack.peek()); // Expected: 30
        System.out.println("Pop: " + stack.pop()); // Expected: 30
        System.out.println("Stack after pop: " + stack.toString()); // Expected: 20 -> 10 -> null
        System.out.println("Stack size: " + stack.size()); // Expected: 2
        System.out.println("Pop: " + stack.pop()); // Expected: 20
        System.out.println("Pop: " + stack.pop()); // Expected: 10
        System.out.println("Stack empty after pops: " + stack.isEmpty()); // Expected: true
        System.out.println("Stack size after pops: " + stack.size()); // Expected: 0
    }

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
    int curr = head.getData();
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
