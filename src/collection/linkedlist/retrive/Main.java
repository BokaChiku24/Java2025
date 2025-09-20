package collection.linkedlist.retrive;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList<String>();
        addElements(list);
        gettingElements(list);
        System.out.println("-".repeat(30));
        printItinerary(list);
        System.out.println("-".repeat(30));
        printItinerary2(list);
        System.out.println("-".repeat(30));
        printItinerary3(list);
    }

    private static void addElements(LinkedList<String> list) {
        list.add("abc"); //4
        list.push("push"); //3
        list.addFirst("addfirst"); //2
        list.addLast("addlast"); //5
        list.add(0, "Adding to index 0"); //1
        list.push("push"); //0
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrived Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());
        System.out.println("Push index of = " + list.indexOf("push"));
        System.out.println("Push last index of = " + list.lastIndexOf("push"));
        System.out.println("Push index of = " + list.indexOf("Adding to index 0"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element()); // the head of this list

        // Stack retrieval method
        System.out.println("Pick peek = " + list.peek());
        System.out.println("Pick peek first = " + list.peekFirst());
        System.out.println("Pick peek last = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Start at " + list.getFirst());
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Ends at" + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){
        String first = list.getFirst();
        System.out.println("Start at " + first);
        for( String name : list){
            System.out.println("--> From: " + first + " to " + name);
            first = name;
        }
        System.out.println("Ends at" + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Start at " + list.getFirst());
        String first = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var next = iterator.next();
            System.out.println("--> From: " + first + " to " + next);
            first = next;
        }
        System.out.println("Ends at " + list.getLast());
    }
}
