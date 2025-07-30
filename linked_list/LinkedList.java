public class LinkedList {
    Node head = null;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

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

    // delete first , delete last
    public void deleteFirst() {
        head = head.next;
        return;
    }

    public void deleteLast() {

        Node currNode = head;

        while ((currNode.next).next != null) {

            currNode = currNode.next;

        }
        currNode.next = null;

        return;

    }

    // method to reverset the array
    public void reverseList() {
        Node prev = null;
        Node curr = head;
        Node nxt = null;
        if (head == null) {
            System.err.println("The list is empty");
            return;
        }
        if (head.next == null) {
            return;
        }

        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;

        }
        head = prev;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirst("my ");
        list.addLast("name");
        list.addLast("is");
        list.addLast("samir");
        list.addLast("dhakal");
        // list before reversing
        list.printList();
        list.reverseList();
        System.out.println("list after reverse");
        list.printList();
    }
}
