package org.solutions.linkedlist;

import java.util.Objects;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedListNode linkedListNode1 = new LinkedListNode(1);
        LinkedListNode linkedListNode2 = new LinkedListNode(2);
        LinkedListNode linkedListNode3 = new LinkedListNode(3);
        LinkedListNode linkedListNode4 = new LinkedListNode(4);
        LinkedListNode linkedListNode5 = new LinkedListNode(5);
        LinkedListNode linkedListNode6 = new LinkedListNode(6);
        LinkedListNode linkedListNode7 = new LinkedListNode(7);
        linkedListNode1.setNext(linkedListNode2);
        linkedListNode2.setNext(linkedListNode3);
        linkedListNode3.setNext(linkedListNode4);
        linkedListNode4.setNext(linkedListNode5);
        linkedListNode5.setNext(linkedListNode6);
        linkedListNode6.setNext(linkedListNode7);
        System.out.println("Reversed LinkedList : " + reverseLinkedList(linkedListNode1));
    }

    public static LinkedListNode reverseLinkedList(LinkedListNode head){
        LinkedListNode prev = null; //maintains head of new revered list
        LinkedListNode current = head; //maintains current node
        LinkedListNode next = null; //maintains next node which has non-traversed elements
        while (current != null){
            System.out.println("Prev : " + (Objects.nonNull(prev) ? prev.getValue() : null) +
                    "  Current : " + (Objects.nonNull(current) ? current.getValue() : null)
                    + "  Next : " + (Objects.nonNull(next) ? next.getValue() : null));
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }
}
