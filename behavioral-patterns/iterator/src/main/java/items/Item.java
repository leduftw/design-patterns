package items;

import java.util.HashSet;
import java.util.Set;

public class Item {

    private Set<String> tags;
    private String description;

    public Item(String description) {
        this(description, new HashSet<>());
    }

    public Item(String description, Set<String> tags) {
        this.description = description;
        this.tags = tags;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public Set<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Item{" +
                "tags=" + tags +
                ", description='" + description + '\'' +
                '}';
    }

}
