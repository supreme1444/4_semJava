package java3;

import java.util.LinkedList;

public class ListNode {
    public static void main(String[] args) {
        LinkedList<Integer> listInt = new LinkedList<Integer>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        enqueue(listInt);
        first(listInt);
        dequeue(listInt);
        // System.out.println(enqueue(listInt));
    }

    public static void enqueue(LinkedList<Integer> linkedeenqueue) {
        linkedeenqueue.addLast(5);
        System.out.println(linkedeenqueue);
    }

    public static void dequeue(LinkedList<Integer> linkedenqueue) {
        linkedenqueue.pollFirst();
        System.out.println(linkedenqueue);
    }

    public static void first(LinkedList<Integer> linkedfirst) {

        linkedfirst.peekFirst();
        System.out.println(linkedfirst.peekFirst());
    }

}
