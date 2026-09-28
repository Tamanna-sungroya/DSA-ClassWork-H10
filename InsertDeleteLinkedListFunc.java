import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtFront(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    void insertAtEnd(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = temp;
    }

    void deleteFromFront() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    void deleteFromEnd() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
    }

    void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

public class InsertDeleteLinkedListFunc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter element for front: ");
        int front = sc.nextInt();
        list.insertAtFront(front);

        System.out.print("Enter element for end: ");
        int end = sc.nextInt();
        list.insertAtEnd(end);

        System.out.println("Original List:");
        list.display();

        list.deleteFromFront();
        System.out.println("\nAfter deleting from front:");
        list.display();

        list.deleteFromEnd();
        System.out.println("\nAfter deleting from end:");
        list.display();
    }
}