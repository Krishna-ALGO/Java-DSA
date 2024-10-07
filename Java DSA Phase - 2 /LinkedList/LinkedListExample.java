import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //1. Adding Element in a LinkedList
        list.add("Apple"); 
        list.add("Banana"); 
        list.add("Orange");
        System.out.print("LinkedList : " + list);
        System.out.println();

        // 2. Adding elemenets at specific position. 
        list.addFirst("Mango");
        System.out.print("LinkedList : " + list);
        System.out.println();
        list.addLast("Grapes");
        System.out.print("LinkedList : " + list);
        System.out.println();
        list.add(2 , "Pineapple");
        System.out.print("LinkedList : " + list);
        System.out.println();
        
        
        //3. Accessing elements : 
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
        
        //4. Removing Element 
        list.removeFirst();
        System.out.print("LinkedList : " + list);
        System.out.println();
        list.removeLast();
        System.out.print("LinkedList : " + list);
        System.out.println();
        list.remove(3);
        System.out.print("LinkedList : " + list);
        System.out.println();
        
        //5. Check if LL contain element or not
        System.out.println(list.contains("Banana"));
        System.out.println(list.contains("Mango"));
        
        //6. Updating the element : 
        System.out.println(list.set(1,"Strawberry"));
        System.out.print("LinkedList : " + list);
        System.out.println();
        
        //7. Iterating through the LL
        for(String fruit : list){
            System.out.println(fruit);
        }
        
        //8. Using Iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list.size());
        
        // 9. Clearing the linkedlist
        list.clear();
        System.out.print("LinkedList : " + list);
        System.out.println();

        //10. isEmpty : 
        System.err.println(list.isEmpty());

        // 11. Size of LL: 
        System.out.println(list.size());
    }
}
