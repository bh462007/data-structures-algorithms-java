class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public Node segregateOddEvenIndex(Node head) {

        // Edge case
        if (head == null || head.next == null) return head;

        // Initialize odd and even pointers
        Node oddHead = head, oddTail = head;
        Node evenHead = head.next, evenTail = head.next;
        Node current = head.next.next; 

        boolean isOdd = true; 

        while (current != null) {
            if (isOdd) {
                oddTail.next = current;
                oddTail = oddTail.next;
            } else {
                evenTail.next = current;
                evenTail = evenTail.next;
            }

            current = current.next;
            isOdd = !isOdd; // flip between odd/even
        }

        // Merge odd and even lists
        oddTail.next = evenHead;
        evenTail.next = null; 

        return oddHead;
    }
}

// Driver code
class EvenOddNodesIndex {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Creating linked list: 17 -> 15 -> 8 -> 12 -> 10 -> 5 -> 4
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);

        Node newHead = sol.segregateOddEvenIndex(head);

        // Print result
        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}