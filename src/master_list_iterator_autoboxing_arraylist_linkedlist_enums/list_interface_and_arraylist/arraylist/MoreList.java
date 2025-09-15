package master_list_iterator_autoboxing_arraylist_linkedlist_enums.list_interface_and_arraylist.arraylist;

import java.util.ArrayList;
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
    }
}
