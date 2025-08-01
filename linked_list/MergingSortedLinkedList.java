// package linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class MergingSortedLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.push(4);
        list1.addFirst(5);
        list1.addFirst(6);
        list1.addFirst(7);
        LinkedList<Integer> Sorted = new LinkedList<>();
        input.close();
    }
}