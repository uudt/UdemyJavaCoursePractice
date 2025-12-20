package dev.uudt;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(String name) {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

        // array filled with any type of objects
        Object[] groceryArr = new Object[3];
        groceryArr[0] = new GroceryItem("milk");
        groceryArr[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArr[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArr));

        // array filled with items type of GroceryItem[] (Record or POJO)
        GroceryItem[] groceryArr2 = new GroceryItem[3];
        groceryArr2[0] = new GroceryItem("milk");
        groceryArr2[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArr2[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArr2));

        // Raw use of a type (no type of items is specified - Object type is default)
        ArrayList list = new ArrayList();
        list.add(new GroceryItem("Butter"));
        list.add("Yogurt");
        list.add(4);

        // List with specified items type
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 8));
        // add to specified index
        groceryList.add(0, new GroceryItem("apples", "PRODUCE", 3));
        System.out.println(groceryList);

    }
}
