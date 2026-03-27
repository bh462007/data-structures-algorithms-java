class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
}

class InsertAtEndDLL{
    Node head;

    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    void printData(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertAtEndDLL obj=new InsertAtEndDLL();
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);

        obj.printData();
    }
}