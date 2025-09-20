package master_list_iterator_autoboxing_arraylist_linkedlist_enums.linkedlist.forward_reverse;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
        System.out.println("-".repeat(50));

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        System.out.println("-".repeat(50));

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        System.out.println("-".repeat(50));
        testIterator(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack Methods
        list.push("Alice Springs");

    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        // Queue/Deque poll methods
        String p1 = list.poll();  // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();  // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();  // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();  // removes first element
        System.out.println(p4 + " was removed");

    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        while(iterator.hasNext()){
            // System.out.println(iterator.next());
            if(iterator.next().equals("Sydney")){
                iterator.remove();
            }
        }
        while(iterator.hasNext()){ // Condition 'iterator.hasNext()' is always 'false'
            System.out.println(iterator.next());
        }
        var iteratorList = list.listIterator();
        while(iteratorList.hasPrevious()){
            // System.out.println(iterator.next());
            if(iteratorList.next().equals("Sydney")){
                iteratorList.previous();
            }
        }
        System.out.println(list);
    }
}
