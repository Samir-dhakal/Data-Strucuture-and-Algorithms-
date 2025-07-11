import java.util.Scanner;

public class LinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

        // add first
        public static void addFirst(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                newNode.next = head;
                return;
            }
            newNode.next = head;
            newNode = head;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        input.close();
    }
}