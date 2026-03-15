class Node{
    int data;
    Node next;
}
class DeletionAtPosition{
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
        System.out.println("After deletion at the end");
        
        Node temp=head;
        while(temp.next.data!=30){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }

    }
}