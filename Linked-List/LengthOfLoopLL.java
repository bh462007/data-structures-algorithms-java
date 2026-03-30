
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LengthOfLoopLL {

    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Meeting at: " + slow.data);
                Node temp = slow;
                int count = 0;

                do {
                    count++;
                    temp = temp.next;
                } while (temp != slow);

                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

// create loop
        n5.next = n2;

        LengthOfLoopLL obj = new LengthOfLoopLL();
        int len = obj.lengthOfLoop(n1);
        System.out.println("Length of loop: " + len);
    }
}
