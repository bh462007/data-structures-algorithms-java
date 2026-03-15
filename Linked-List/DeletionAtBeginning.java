class Node{
    int data;
    Node next;
}
class DeletionAtBeginning{
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

        Node fourth=new Node();
        fourth.data=40;
        fourth.next=null;

        Node head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;

        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }


        System.out.println("After deleting first node:");
        head=head.next;
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}