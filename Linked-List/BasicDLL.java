class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class BasicDLL {
    Node head;

    void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        BasicDLL obj = new BasicDLL();
        obj.insertAtStart(10);
        obj.insertAtStart(20);
        obj.insertAtStart(30);

        obj.printForward(); // 30 20 10
    }
}