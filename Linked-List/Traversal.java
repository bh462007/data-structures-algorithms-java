
class Node{
    int data;
    Node next;
}
class Traversal{
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

        first.next=second;
        second.next=third;

        Node current=first;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}