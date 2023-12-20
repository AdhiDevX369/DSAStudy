package Queue;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(45);
        q.enQueue(46);
        q.deQueue();
        q.deQueue();

        q.enQueue(50);
        q.enQueue(60);

        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println("Size: " + q.getSize());
        q.show();
    }
}
