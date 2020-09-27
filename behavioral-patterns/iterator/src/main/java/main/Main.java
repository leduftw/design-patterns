package main;

import items.Item;
import items.Items;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("item1");
        item1.addTag("t1");
        item1.addTag("t5");
        item1.addTag("t4");

        Item item2 = new Item("item2");
        item2.addTag("t2");
        item2.addTag("t1");

        Item item3 = new Item("item3");
        item3.addTag("t3");
        item3.addTag("t1");
        item3.addTag("t8");
        item3.addTag("t7");
        item3.addTag("t5");
        item3.addTag("t6");

        Item item4 = new Item("item4");
        item4.addTag("t4");

        Item item5 = new Item("item5");
        item5.addTag("t5");
        item5.addTag("t6");
        item5.addTag("t4");
        item5.addTag("t2");
        item5.addTag("t1");

        Items items = new Items(List.of(item1, item2, item3, item4, item5));

        // Iterating through items with given tag
        for (Iterator<Item> itemIterator = items.iterator("t6"); itemIterator.hasNext(); ) {
            Item item = itemIterator.next();
            System.out.println(item);
        }
    }

}
