package LinkedList;

public class LinkedList {
    Node head; // Reference to the first node in the list (head of the linked list)

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node node = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty, make the new node the head
            head = node;
        } else {
            Node n = head;
            while (n.next != null) { // Traverse the list to find the last node
                n = n.next;
            }
            n.next = node; // Attach the new node at the end
        }
    }

    // Method to insert a new node at the beginning of the list
    public void insertAtStart(int data) {
        Node node = new Node(data); // Create a new node with the given data
        node.next = head; // Set the next of the new node to the current head
        head = node; // Update the head to the new node
    }

    // Method to insert a new node at a specified index in the list
    public void insertAt(int index, int data) {
        Node node = new Node(data); // Create a new node with the given data
        Node n = head;
        if (index == 0) { // If index is 0, insert at the start (use insertAtStart method)
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) { // Traverse to the node before the specified index
                n = n.next;
            }
            node.next = n.next; // Attach the new node to the next of the current node
            n.next = node; // Update the next of the current node to the new node
        }
    }

    // Method to delete a node at a specified index from the list
    public void deleteAt(int index) {
        if (index == 0) { // If index is 0, delete the first node (update head)
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) { // Traverse to the node before the specified index
                n = n.next;
            }
            n1 = n.next; // Node to be deleted
            n.next = n1.next; // Skip the node to be deleted
            // Printing the data of the deleted node (for demonstration)
            System.out.println("Deleted Node Data: " + n1.data);
        }
    }

    // Method to display the elements of the linked list
    public void show() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) { // Traverse and display each node's data
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
