class Node{
    int data;
    Node next;
}
class InsertionAtEnd{
    public static void main(String[] args) {
        Node first=new Node();
        first.data=10;
        first.next=null;

        Node second=new Node();
        second.data=20;
        second.next=null;

        Node third=new Node();
        third.data=30;
        third.next=null;

        Node head=first;
        first.next=second;
        second.next=third;

        Node fourth=new Node();
        fourth.data=40;
        fourth.next=null;

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=fourth;

        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}