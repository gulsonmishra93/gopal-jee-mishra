package com.practice.demo.RotateLinkedList;

public class RotateLinkedList {
    static Node head;
    public static void main(String[] args) {
    for(int i = 60;i>0;i=i-10){

        push(i);

    }
    print(head);
    System.out.println("=====");
    head = rotateLinkedList(head,8);
    print(head);
    }

    public static void  push(int new_data){

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void  print(Node node) {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
        public static Node rotateLinkedList(Node head,int k){
            if(head == null || k ==0){
                return head;
            }
            int size =1;
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
                size++;

            }
            System.out.println("size=="+size);

            if(k > size){
                k = k%size;
            }
            System.out.println("K=="+k);
            curr.next = head;

            curr = head;

            for(int i =0;i<k-1;i++){
                curr = curr.next;
            }
            head = curr.next;
            curr.next = null;
           return head;

        }


}
