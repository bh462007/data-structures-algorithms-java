
class Node{
    int data;
    Node next;
}
class Minimum{
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
        fourth.data=5;
        fourth.next=null;

        Node head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println("Minimum element:");
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        int min=head.data;
        while(temp!=null){
            if(temp.data < min){
                min=temp.data;
            }
            temp=temp.next;
        }
        System.out.println(min);
    }
}