class Node{
    int data;
    Node next;
}
class ListLength{
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

        System.out.println("Length of the list...");
        int count=0;
        Node demo=head;
        while(demo!=null){
            count++;
            demo=demo.next;
        }
        System.out.println(count);
    }
}