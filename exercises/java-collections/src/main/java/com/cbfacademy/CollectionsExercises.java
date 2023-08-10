package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.addLast(2);
        linkedList.add(2, 4);

        int resultLink = linkedList.element();
        System.out.println(resultLink);

        return linkedList;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> newArrayDeque = new ArrayDeque<>();
        
        newArrayDeque.add(5);
        newArrayDeque.add(6);
        newArrayDeque.add(8);
        newArrayDeque.add(9);

       int firstElement = newArrayDeque.peekFirst();
       System.out.println(firstElement);

       int lastElement = newArrayDeque.peekLast();
       System.out.println(lastElement);

        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {

        HashMap<Integer, String> progLang = new HashMap<>(); 
        progLang.put(1, "TypeScript");
        progLang.put(2, "Kotlin");
        progLang.put(3, "Python");
        progLang.put(4, "Java");
        progLang.put(5, "JavaScript");
        progLang.put(6, "Rust");

        Set<Integer> keys = progLang.keySet();
        System.out.println("Set of keys from the map: " + keys);

        boolean containsKey4 = progLang.containsKey(4);
        System.out.println("Does the map contain key 4? " + containsKey4);
            
        //  - determine whether the map contains "English" as a language and print the result on the screen
        return progLang;
      
    }

    public String getName() {
        return "Collections Exercises";
    }
}
