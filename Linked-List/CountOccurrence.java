
class Node{
    int data;
    Node next;
}
class CountOccurrence{
    public static void main(String[] args) {
        Node first=new Node();
        first.data=10;
        first.next=null;

        Node second=new Node();
        second.data=5;
        second.next=null;

        Node third=new Node();
        third.data=5;
        third.next=null;

        Node fourth=new Node();
        fourth.data=5;
        fourth.next=null;

        Node head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println("Count of occurrence:");
        Node temp=head;
        int target=5;
        int count=0;

        while(temp!=null){
            if(temp.data==target){
                count++;
            }
            temp=temp.next;
        }
        System.out.println(count);
    }
}
