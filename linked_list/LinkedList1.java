// package linked_list;

import java.util.LinkedList;

// import java.util.Scanner;

public class LinkedList1 {
    Node head;

    class Node {

        Node next;
        String data;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // to find out weather the linked list is looped or not
    public void IsLooped(Node head) {
        if (head == null) {
            return;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && slow != null) {
            fast = (fast.next).next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println(" list is looped ");
                return;
            }

        }
        System.out.println(" your linked list is not looped ");

    }

    // add - first , last
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    // to print the list
    public void printList() {
        if (head == null) {
            System.out.println(" the list is empty ");
            return;

        }
        Node currNode;
        currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        LinkedList1 list = new LinkedList1();
        list.addFirst("is ");
        list.addFirst("this ");
        list.addFirst("looped ");
        list.addFirst("LinkedLIst ");
        list.printList();
        list.IsLooped(list.head);
    }
}