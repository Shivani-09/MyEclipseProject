package main;


public class DoublyLinkedList {
	public class Node {
	    int data;
	    Node prev;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}
	
    Node head;
    Node tail;
    int size; // Still useful for size checks without iterating

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null; // or size == 0
    }

    // Get the number of elements
    public int getSize() {
        return size;
    }

    // Add a node to the front
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Add a node to the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Remove a node from the front
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty. Cannot remove from front.");
            return -1; // Indicate error or throw exception in real app
        }
        int removedData = head.data;
        if (head == tail) { // Only one element
            head = null;
            tail = null;
        } else {
            head = head.next;
            if (head != null) { // Defensive check
                head.prev = null;
            }
        }
        size--;
        return removedData;
    }

    // Remove a node from the end
    public int removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty. Cannot remove from end.");
            return -1; // Indicate error
        }
        int removedData = tail.data;
        if (head == tail) { // Only one element
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            if (tail != null) { // Defensive check
                tail.next = null;
            }
        }
        size--;
        return removedData;
    }

    // Display the list from head to tail using simple prints
    public void displayForward() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("List (Forward): ");
        while (current != null) {
            System.out.println(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println(" (end)");
    }

    // Display the list from tail to head using simple prints
    public void displayBackward() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        Node current = tail;
        System.out.print("List (Backward): ");
        while (current != null) {
            System.out.print(current.data);
            if (current.prev != null) {
                System.out.print(" <-> ");
            }
            current = current.prev;
        }
        System.out.println(" (start)");
    }
    
}
