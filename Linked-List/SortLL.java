class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class SortLL{
    public Node sortList(Node head){
        if(head==null || head.next==null) return head;
        
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        
        Node left=sortList(head);
        Node right=sortList(rightHead);

        return merge(left,right);
    }
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node left,Node right){
        Node dummy=new Node(0);
        Node tail=dummy;
        while(left!=null && right!=null){
            if(left.data<right.data){
                tail.next=left;
                left=left.next;
            }else{
                tail.next=right;
                right=right.next;
            }
            tail=tail.next;
        }
        if(left!=null) tail.next=left;
        if(right!=null) tail.next=right;
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);

        SortLL obj = new SortLL();
        Node newHead = obj.sortList(head);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}