class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

class myStack{
    private Node head;
    private int size;

    public myStack(){
        this.head = null;
        this.size = 0;
    }
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty , Cannot Pop");
            return -1;
        }
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty , Nothing to Peek");
            return -1;
        }
        return head.val;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void displayStack(){
        if(isEmpty()){
            System.out.println("Stack is Empty ");
            return;
        }
        Node temp = head;
        System.out.println("Stack Element : ");
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackUsingLL {
    public static void main(String[] args) {
        myStack st = new myStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.displayStack();

    }
}
