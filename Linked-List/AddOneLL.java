
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddOneLL {

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static Node addOne(Node head) {
    head = reverse(head);

    Node curr = head;
    Node prev = null;
    int carry = 1;

    while (curr != null && carry > 0) {
        int sum = curr.data + carry;
        curr.data = sum % 10;
        carry = sum / 10;

        prev = curr;
        curr = curr.next;
    }

    if (carry > 0) {
        prev.next = new Node(carry);
    }

    return reverse(head);
}

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(9);

        head = addOne(head);

        printList(head);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
