package record;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("MILK");
        groceryArray[1] = new GroceryItem("APPLES","PRODUCE",5);
        groceryArray[2] = "5 ORANGES";
        System.out.println(Arrays.toString(groceryArray));

        System.out.println("-".repeat(50));

        GroceryItem[] groceryArrayTwo = new GroceryItem[3];
        groceryArrayTwo[0] = new GroceryItem("MILK");
        groceryArrayTwo[1] = new GroceryItem("APPLES","PRODUCE",5);
        groceryArrayTwo[2] = new GroceryItem("ORANGES","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArrayTwo));

        System.out.println("-".repeat(50));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("BUTTER"));
        objectList.add("YOGURT");
        System.out.println(objectList);

        System.out.println("-".repeat(50));

        ArrayList<GroceryItem> groceryItemsList = new ArrayList<>();
        groceryItemsList.add(new GroceryItem("BUTTER"));
        // groceryItemsList.add("YOGURT");
        System.out.println(groceryItemsList);

    }
}
