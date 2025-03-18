public class Queue{
  // This Queue class is designed for integer values >= 0
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Initial queue empty: " + queue.isEmpty()); // Expected: true
        System.out.println("Initial queue empty: " + queue.toString()); // Expected: []
        System.out.println("Initial queue size: " + queue.size()); // Expected: 0
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("queue after enqueues: " + queue.toString()); // Expected: 10 -> 20 -> 30 -> null
        System.out.println("Peek top: " + queue.peek()); // Expected: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 10
        System.out.println("queue after dequeue: " + queue.toString()); // Expected: 10 -> 20 -> null
        System.out.println("queue size: " + queue.size()); // Expected: 2
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 20
        System.out.println("queue empty after dequeues: " + queue.isEmpty()); // Expected: true
        System.out.println("queue size after dequeues: " + queue.size()); // Expected: 0
    }
  // Place private instance variables here 
  private Node head;
  private int size;

  // Place constructors here
  public Queue(){
    size = 0;
    head = null;
  }

  
  // Enqueue a new value to the queue
  public void enqueue(int value){
    Node a = new Node(value);
    if (head == null){
      head = a;
    }
    else{
      while (head.getNext() != null){
        head = head.getNext();
      }
      head.setNext(a);
    }
    size++;
  }

   
  // Dequeue a value from the queue
  public int dequeue(){
    size -= 1;
    int curr = head.getData();
    head = head.getNext();
    return curr;
  }

  // Return the front/top
  public int peek(){
    return head.getData();
  }


  // Check is queue is empty
  public boolean isEmpty(){
    if (head == null){
      return true;
    }
    return false;
  }

  // Return queue size
  public int size(){
    return size;
  }

  
  // Print queue
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
    d += "null]";
    return d;
  }

}
