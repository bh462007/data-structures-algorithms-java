class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackUsingLL{
    Node head;
    int size;

    public StackUsingLL() {
        this.head = null;
        this.size = 0;
    }
    public void push(int x){
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
        size++;
    }
    public int pop(){
        if(head==null){
            System.out.println("Stack underflow");
            return -1;
        }
        
        int val=head.data;
        head=head.next;
        size--;

        return val;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        StackUsingLL obj=new StackUsingLL();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        System.out.println(obj.peek());

        obj.pop();
        System.out.println(obj.peek());

        System.out.println(obj.isEmpty());
    }
    
}