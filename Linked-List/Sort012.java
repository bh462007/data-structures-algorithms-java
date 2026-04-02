

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Sort012{
    public Node sortList(Node head){
        if(head ==null || head.next==null) return head;
        Node zero=new Node(-1);
        Node one=new Node(-1);
        Node two=new Node(-1);

        Node zeroTail=zero;
        Node oneTail=one;
        Node twoTail=two;

        Node temp=head;
        while(temp!=null ){
            if(temp.data==0){
                zeroTail.next=temp;
                zeroTail=zeroTail.next;
                
            }
            else if(temp.data==1){
                oneTail.next=temp;
                oneTail=oneTail.next;
                
            }
            else{
                twoTail.next=temp;
                twoTail=twoTail.next;
                
            }
            temp=temp.next;

        }
        zeroTail.next=(one.next!=null)?one.next:two.next;
        oneTail.next=two.next;
        twoTail.next=null;
        return (zero.next!=null)?zero.next:(one.next!=null)?one.next:two.next;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(2);

        Sort012 obj=new Sort012();
        Node result=obj.sortList(head);
        while(result!=null){
            System.out.print(result.data+" -> ");
            result=result.next;
        }
        System.out.print("null");
    }
}