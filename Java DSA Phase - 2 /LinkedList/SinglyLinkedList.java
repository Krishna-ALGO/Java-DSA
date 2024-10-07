public class SinglyLinkedList {
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static Node head;
    private static Node tail;
    private int size;
    public SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void inserAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAt(int index , int data){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index Invalid"); 
        }
        if(index == 0){
            inserAtBeginning(data);
        }else if(index == size){
            insertAtEnd(data);
        }else{
            Node newNode = new Node(data);
            Node temp = head;
            for(int i = 0; i<index - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public int getElementAt(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index Invalid"); 
        }
        Node temp = head;
        for(int i = 0 ; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int length(){
        return size;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.display();
        list.inserAtBeginning(40);
        list.display();
        list.inserAtBeginning(30);
        list.display();
        list.inserAtBeginning(20);
        list.display();
        list.inserAtBeginning(10);
        list.display();
        System.out.println(list.getElementAt(4));
        list.insertAt(4, 55);
        list.display();
        System.out.println(list.length());
    }
}
