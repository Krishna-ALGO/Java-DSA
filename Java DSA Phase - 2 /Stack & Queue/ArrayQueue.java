public class ArrayQueue {
    private int[] queue;
    private int front; 
    private int rear; 
    private int size; 
    private int capacity; 
    
    public ArrayQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full , Can't add a new Element");
            return;
        }
        rear = (rear + 1) % capacity; // Circular Queue 
        queue[rear] = element;
        size++; 
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty, Can't dequeue");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity; // Circular Queue
        size--;
        return element;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty, Can't peek");
            return -1;
        }
        return queue[front];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5); // int[] q = new int[5];
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.peek());
        System.out.println(queue.isFull());
        queue.enqueue(60);
        

    }
}
