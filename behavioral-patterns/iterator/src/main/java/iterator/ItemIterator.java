package iterator;

import items.Item;
import items.Items;

import java.util.Iterator;

public class ItemIterator implements Iterator<Item> {

    private Items items;
    private String searchedTag;

    private int curIdx = 0;

    public ItemIterator(Items items, String searchedTag) {
        this.items = items;
        this.searchedTag = searchedTag;
    }

    private int findNextIdx() {
        for (int idx = curIdx; idx < items.size(); idx++) {
            if (items.get(idx).getTags().contains(searchedTag)) {
                return idx;
            }
        }

        return -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        curIdx = findNextIdx();
        if (curIdx == -1) {
            return null;
        }

        return items.get(curIdx++);
    }

}
