
class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class ReverseDLL {

    Node reverseDLL(Node head) {

        Node curr = head;
        Node prevNode = null;

        while (curr != null) {

            // swap next and prev
            Node next = curr.next;
            curr.next = curr.prev;
            curr.prev = next;

            // move prevNode forward
            prevNode = curr;

            // move curr
            curr = curr.prev;
        }

        return prevNode; 
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    Node createList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        ReverseDLL obj = new ReverseDLL();

        int[] arr = {10, 20, 30, 40};

        Node head = obj.createList(arr);

        System.out.print("Before: ");
        obj.printList(head);

        head = obj.reverseDLL(head);

        System.out.print("After: ");
        obj.printList(head);
    }

}
