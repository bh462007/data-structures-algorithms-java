class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

class DeleteLastNodeDLL {

    Node deleteLast(Node head) {

        if(head==null) return null;
        
        if(head.next==null) return null;

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;

        return head;
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
        if (arr.length == 0) return null;

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
        DeleteLastNodeDLL obj=new DeleteLastNodeDLL();
        int[] arr = {10, 20, 30, 40};

        Node head = obj.createList(arr);

        System.out.print("Before: ");
        obj.printList(head);

        head = obj.deleteLast(head);

        System.out.print("After: ");
        obj.printList(head);
    }
}