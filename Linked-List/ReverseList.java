

class Node{
    int data;
    Node next;
}
class ReverseList{
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

        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        System.out.println("Reversing List...");
        Node current=head;
        Node prev=null;

        while(current!=null){
            Node next=current.next;
            current.next=prev;

            prev=current;
            current=next;
        }
        head=prev;

        Node demo=head;
        while(demo!=null){
            System.out.println(demo.data);
            demo=demo.next;
        }
    }
}