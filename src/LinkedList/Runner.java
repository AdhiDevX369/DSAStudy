package LinkedList;

public class Runner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            int value = i + 1;

            list.insert(value);
        }
        list.deleteAt(3);
        list.show();

    }
}
