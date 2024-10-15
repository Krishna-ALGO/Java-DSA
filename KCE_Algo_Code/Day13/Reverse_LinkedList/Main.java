import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class Main {
    public static Node reverseList(Node head) {
       // write your code 
       Node temp=head;
       Node prev=null;
       while(temp!=null){
           Node front=temp.next;
           temp.next=prev;
           prev=temp;
           temp=front;
       }
       return prev;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            list.add(x);
        }

        list.head = reverseList(list.head);
        list.printList();
    }
}