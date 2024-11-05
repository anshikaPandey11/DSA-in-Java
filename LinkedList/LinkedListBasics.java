import java.util.*;

public class LinkedListBasics {
    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedListBasics ll = new LinkedListBasics();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
    }
}
