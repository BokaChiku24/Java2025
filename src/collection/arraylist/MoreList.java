package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "egg"};
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.add("Yoghurt");
        System.out.println(arrayList);

        ArrayList<String> nextList = new ArrayList<>(List.of("Pickles","Mustard","Cheese"));
        System.out.println(nextList);
        arrayList.addAll(nextList);
        System.out.println(arrayList);

        System.out.println("Third item = " + arrayList.get(2));

        if(arrayList.contains("mustard")){
            System.out.println("List contains mustard");
        }

        arrayList.add("yogurt");
    System.out.println("First = " + arrayList.indexOf("yogurt"));
    System.out.println("First = " + arrayList.indexOf("Yoghurt"));
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.remove("yogurt");
        System.out.println(arrayList);

        arrayList.removeAll(List.of("apples","egg"));
        System.out.println(arrayList);

        arrayList.retainAll(List.of("apples","milk","Mustard","cheese"));
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);

        System.out.println("isEmpty = " + arrayList.isEmpty());

        arrayList.addAll(List.of("apples","milk","mustard","cheese"));

        arrayList.addAll(Arrays.asList("eggs", "pickles","mustard","ham"));

        arrayList.sort(Comparator.naturalOrder());

        System.out.println(arrayList);

        arrayList.sort(Comparator.reverseOrder());

        System.out.println(arrayList);

        var groceryArray = arrayList.toArray(new String[arrayList.size()]);
        System.out.println(Arrays.toString(groceryArray));


    }
}
