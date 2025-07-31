// package linked_list;

import java.util.LinkedList;

// import java.util.Scanner;

public class LinkedList1 extends LinkedList<String> {
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

    public static void main(String args[]) {
        LinkedList1 list = new LinkedList1();
        list.addFirst("is ");
        list.addFirst("this ");
        list.addFirst("looped ");
        list.addFirst("LinkedLIst ");
        System.out.println(list);
        list.IsLooped(list.head);
    }
}