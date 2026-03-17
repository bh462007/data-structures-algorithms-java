
class Node{
    int data;
    Node next;
}
class Maximum{
    public static void main(String[] args) {
        Node first=new Node();
        first.data=10;
        first.next=null;

        Node second=new Node();
        second.data=20;
        second.next=null;

        Node third=new Node();
        third.data=50;
        third.next=null;

        Node fourth=new Node();
        fourth.data=40;
        fourth.next=null;

        Node head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println("Maximum element");
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        int max=head.data;
        while(temp!=null){
            if(temp.data > max){
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println(max);

    }
}