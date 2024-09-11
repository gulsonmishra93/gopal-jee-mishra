package com.practice.demo.reverseLinkedList;


public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node current = head;
        Node prev = null;
        int i = 0;
        while (current != null) {
        i++;
        current = current.next;
        }
    }
}
