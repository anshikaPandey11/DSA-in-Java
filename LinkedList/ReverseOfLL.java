import java.util.*;
public class ReverseOfLL {
    //four step process
    //next = curr.next
    //curr.next =prev
    //prev= curr
    //curr=next
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

    public void reverse(){
        Node prev =null;
        Node curr = tail=head;
        Node next;

        while( curr != null){
            next =curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }
        head =prev;
    }
    public static void main(String[] args) {
        ReverseOfLL ll = new ReverseOfLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.size);
    }

}
