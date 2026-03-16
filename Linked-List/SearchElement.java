class Node{
    int data;
    Node next;
}
class SearchElement{
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

        int target=80;
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                System.out.println("Found");
                break;
            }
            
            temp=temp.next;
        }
        System.out.println("Not found");

    }
}