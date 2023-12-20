package Queue;

public class Queue {

    int queue[] = new int[5];

    int size;
    int front;
    int rear;

    //* EnQueue
    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        } else {
            System.out.println("Queue is Full");
        }
    }

    //* DeQueue
    public int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
            front++;
            size--;
        } else {
            System.out.println("Queue is empty");
        }
        return data;

    }

    //* Size odf Queue
    public int getSize() {
        return size;
    }

    //* isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    //* isFull
    public boolean isFull() {
        return size == 5;
    }

    //* Show
    public void show() {
        System.out.print("Element: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
    }
}
