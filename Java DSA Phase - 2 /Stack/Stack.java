public class Stack {
    private int[] arr;
    private int idx;
    private int maxSize;

    public Stack(int size){
        this.maxSize = size;
        this.arr = new int[maxSize];
        this.idx = 0;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is Fulled , Cannot push");
            return;
        }
        arr[idx] = x;
        idx++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty , Cannot pop");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx - 1] = 0;
        idx--;
        return top;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[idx - 1];
    }

    public boolean isEmpty(){
        return (idx == 0);
    }
    public boolean isFull(){
        return (idx == maxSize);
    }
    public int size(){
        return idx;
    }
    public int capacity(){
        return arr.length;
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        for(int i = 0 ; i < st.size(); i++){
            System.out.print(st.arr[i] + " ");
        }
        System.out.println();
        System.out.println("Peek " + st.peek());
        System.out.println("Pop : " + st.pop());
        for(int i = 0 ; i < st.size(); i++){
            System.out.print(st.arr[i] + " ");
        }
        System.out.println();
        System.out.println("Size : " + st.size());
        st.push(60);
        for(int i = 0 ; i < st.size(); i++){
            System.out.print(st.arr[i] + " ");
        }
        System.out.println();
        System.out.println("Is Full " + st.isFull());
        st.push(70);
        
    }
}

