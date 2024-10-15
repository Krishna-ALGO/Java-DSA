import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    void push(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    public Node sortBinaryList(Node head) {
        //Write your code here
        if(head==null || head.next==null)
        return head;
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node zero=zeroHead;
        Node one=oneHead;
        Node temp=head;
        while(temp!=null){
            if(temp.val==0){
                zero.next=temp;
                zero=zero.next;
            }else{
                one.next=temp;
                one=one.next;
            }
            temp=temp.next;
        }
        zero.next=oneHead.next;
        one.next=null;
        return zeroHead.next;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }
        Solution obj = new Solution();
        Node sortedHead = obj.sortBinaryList(llist.head);
        llist.head = sortedHead;
        llist.printList();
        sc.close();
    }
}