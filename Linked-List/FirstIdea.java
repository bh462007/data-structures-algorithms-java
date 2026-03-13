
class Node{
    int data;
    Node next;
}
class FirstIdea{
    public static void main(String[] args) {
        Node first=new Node();
        first.data=10;
        first.next=null;

        Node second=new Node();
        second.data=20;
        second.next=null;

        first.next=second;
        System.out.println(first.data);
        System.out.println(first.next);
    }
}