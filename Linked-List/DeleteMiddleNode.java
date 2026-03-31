class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class DeleteMiddleNode{
    public Node deleteMiddle(Node head){
        if(head==null || head.next==null) return null;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6); // even length example

        DeleteMiddleNode obj = new DeleteMiddleNode();
        Node newHead = obj.deleteMiddle(head);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}