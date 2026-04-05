class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class FindIntersection {
    public static Node getIntersectionNode(Node headA, Node headB){
        Node p1=headA;
        Node p2=headB;
        while(p1!=p2){
            p1=(p1==null)?headB:p1.next;
            p2=(p2==null)?headA:p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {

        // Common part (intersection)
        Node common = new Node(4);
        common.next = new Node(5);

        // List A: 1 → 2 → 3 → 4 → 5
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = common;

        // List B: 9 → 4 → 5
        Node headB = new Node(9);
        headB.next = common;

        // Call your method
        Node result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection at node: " + result.data);
        } else {
            System.out.println("No intersection");
        }
    }
}