package org.dsa.linkedlist;

import java.util.Objects;
import java.util.Stack;

public class PalindromeLinkedList {


    public static void main(String[] args) {
        LinkedListNode linkedListNode1 = new LinkedListNode(1);
        LinkedListNode linkedListNode2 = new LinkedListNode(2);
        LinkedListNode linkedListNode3 = new LinkedListNode(3);
        LinkedListNode linkedListNode4 = new LinkedListNode(4);
        LinkedListNode linkedListNode5 = new LinkedListNode(3);
        LinkedListNode linkedListNode6 = new LinkedListNode(2);
        LinkedListNode linkedListNode7 = new LinkedListNode(1);
        linkedListNode1.setNext(linkedListNode2);
        linkedListNode2.setNext(linkedListNode3);
        linkedListNode3.setNext(linkedListNode4);
        linkedListNode4.setNext(linkedListNode5);
        linkedListNode5.setNext(linkedListNode6);
        linkedListNode6.setNext(linkedListNode7);
        System.out.println("Given Singly Linked List is Palindrome ? " +  checkIfLinkedListPalindrome1(linkedListNode1));
        System.out.println("Given Singly Linked List is Palindrome ? " +  checkIfLinkedListPalindrome2(linkedListNode1));
    }


    /**
     * By finding mid of the linkedList and reversing second half of the linkedList
     * then compare first and second half elements
     */
    private static boolean checkIfLinkedListPalindrome1(LinkedListNode linkedListNode){
        boolean isPalindrome = true;
        LinkedListNode last = linkedListNode;
        LinkedListNode mid = linkedListNode;
        //find the middle of the linkedList by using two slow and fast pointers
        while (last !=null && last.getNext()!=null){
            last = last.getNext().getNext();
            mid = mid.getNext();
        }
        //reverse the second part of the linked list from mid-node
        LinkedListNode prev = ReverseLinkedList.reverseLinkedList(mid);
        while (prev != null){
            if(!Objects.equals(linkedListNode.getValue(), prev.getValue())){
                isPalindrome = false;
                break;
            }
            linkedListNode = linkedListNode.getNext();
            prev = prev.getNext();
        }
        return isPalindrome;
    }

    /**
     * By finding mid of the linkedList and adding the first half of the list to the stack
     * pop the elements from the stack and then compare with second half elements
     */
    private static boolean checkIfLinkedListPalindrome2(LinkedListNode linkedListNode){
        boolean isPalindrome = true;
        Stack<LinkedListNode> stack = new Stack<>();
        LinkedListNode last = linkedListNode;
        LinkedListNode mid = linkedListNode;
        /**
         * find the middle of the linkedList by using two slow and fast pointers and
         * add first half i.e. slow pointer to stack
         */
        while (last !=null && last.getNext()!=null){
            last = last.getNext().getNext();
            stack.push(mid);
            mid = mid.getNext();
        }
        if(last != null){
            mid = mid.getNext();
        }
        while (mid != null){
            if(stack.isEmpty() || !Objects.equals(stack.pop().getValue(), mid.getValue())){
               isPalindrome = false;
               break;
            }
            mid = mid.getNext();
        }
        return isPalindrome;
    }

}
