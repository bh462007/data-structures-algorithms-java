class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class RecursiveReverseList{
    public Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newNode=reverse(head.next);
        head.next.next=head;
        head.next=null;

        return newNode;
    }
    void print(Node rev){
        Node temp=rev;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);

        RecursiveReverseList obj=new RecursiveReverseList();
        Node rev=obj.reverse(head);
        
        obj.print(rev);
    }
}