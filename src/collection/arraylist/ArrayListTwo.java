package collection.arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListTwo {
    public static void main(String[] args) {
       String[] originalArray = new String[] {"First", "Second", "Third"};
       var originalList = Arrays.asList(originalArray);

       originalList.set(0, "One");
       System.out.println("List: " + originalList);
       System.out.println("Arrays: " + Arrays.toString(originalArray));

       originalList.sort(Comparator.naturalOrder());
        System.out.println("Arrays: " + Arrays.toString(originalArray));

        // originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
}
