class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class EvenOddNodes{
    public Node segregate(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node oddhead=null, oddtail=null;
        Node evenhead=null, eventail=null;
        Node current=head;

        while(current != null){
            if(current.data % 2 == 0){
                if(evenhead == null){
                    evenhead = eventail = current;
                } else {
                    eventail.next = current;
                    eventail = eventail.next;
                }
            } else {
                if(oddhead == null){
                    oddhead = oddtail = current;
                } else {
                    oddtail.next = current;
                    oddtail = oddtail.next;
                }
            }
            current = current.next;
        }

        if(evenhead == null) return oddhead;
        if(oddhead == null) return evenhead;

        eventail.next = oddhead;
        oddtail.next = null; // terminate list

        return evenhead;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(10);

        EvenOddNodes obj = new EvenOddNodes();
        Node newhead = obj.segregate(head);

        while(newhead != null){
            System.out.print(newhead.data + " ");
            newhead = newhead.next;
        }
    }
}