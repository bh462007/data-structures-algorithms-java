
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
class QueueUsingLL{
    Node start; // front 
    Node end;   // rear

    public QueueUsingLL(){
        this.start = null;
        this.end = null;
    }

    public void enqueue(int x){
        Node newNode = new Node(x);
        if(start == null){
            start = end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
    }

    public int dequeue(){
        if(start == null){
            System.out.println("Underflow");
            return -1;
        }
        int val = start.data;
        start = start.next;

        if(start == null){
            end = null;
        }

        return val;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public int peek(){
        if(start == null){
            return -1;
        }
        return start.data;
    }

    public static void main(String[] args) {
        QueueUsingLL obj=new QueueUsingLL();
        obj.enqueue(10); 
        obj.enqueue(20); 
        obj.enqueue(30); 
        obj.enqueue(40); 
        System.out.println(obj.peek()); 
        
        obj.dequeue(); 
        obj.dequeue(); 
        
        System.out.println(obj.peek());
         
        System.out.println(obj.isEmpty());
    }
}