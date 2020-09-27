package items;

import iterator.ItemIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Items {

    private List<Item> items;

    public Items() {
        this(new ArrayList<>());
    }

    public Items(List<Item> items) {
        this.items = items;
    }

    public Item get(int idx) {
        return items.get(idx);
    }

    public int size() {
        return items.size();
    }

    public Iterator<Item> iterator(String tag) {
        return new ItemIterator(this, tag);
    }

}
