public class TestQueue {
    public static void main(String[] args) {
        Queue q1 = new Queue();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);


        Queue q2 = new Queue();

        q2.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

        Queue q3 = new Queue();

        q3.enqueue(10);
        q3.enqueue(30);
        q3.enqueue(20);

        System.out.println(q1.areEqual(q1, q2));

    }
}
