import java.util.*;

public class Search {
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
    public static int size;

    public void addFirst(int data) {
        // Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode next =head
        newNode.next = head;// link

        // head=newNode
        head = newNode;
    }

    // Add element at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    // print Linked List
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println();
    }

    //Search 

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }
    public int helper(Node head ,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx =helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    public static void main(String[] args) {
        Search ll = new Search();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println(ll.itrSearch(2));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.size);
        System.out.println(ll.recSearch(1));
    }
}
