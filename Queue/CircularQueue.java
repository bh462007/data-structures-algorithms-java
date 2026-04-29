public class CircularQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // check full
    public boolean isFull() {
        return size == capacity;
    }

    // check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // enqueue
    public void enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    // dequeue
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int value = arr[front];

        if (size == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;

        return value;
    }

    // peek
    public int peek() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();

        q.enqueue(6);
        q.enqueue(7);

        q.display();
    }
}