package master_list_iterator_autoboxing_arraylist_linkedlist_enums.list_interface_and_arraylist.arraylist;

import java.util.ArrayList;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(),type);
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<GroceryItem> list = new ArrayList<>();
        list.add(new GroceryItem("BUTTER"));
        list.add(new GroceryItem("MILK"));
        list.add(new GroceryItem("ORANGES","PRODUCE",5));
        list.add(0,new GroceryItem("APPLE","PRODUCE",6));
        list.set(1,new GroceryItem("BANANA","PRODUCE",10));
        list.remove(1);
        System.out.println(list.toString());
    }
}
