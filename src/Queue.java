public class Queue {
    Node front;
    Node rear;
    int size;


    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }


    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Empty queue");
        }
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    boolean areEqual(Queue q1, Queue q2) {
        if (q1.size != q2.size) return false;

        Node curr1 = q1.front;
        Node curr2 = q2.front;

        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }
}
