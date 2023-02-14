import java.util.ArrayList;

public class MyHashTable {
    private ArrayList<Object>[] bukets;
    private int capacity;

    public MyHashTable(int capacity) {
        this.capacity = capacity;
        bukets = new ArrayList[capacity];
        for (int i = 0; i < capacity; i++) {
            bukets[i] = new ArrayList<>();
        }
    }

    public void add(Object object) {
        int hashCode = object.hashCode() % capacity;
        if (!bukets[hashCode].contains(object)) {
            bukets[hashCode].add(object);
        }
    }

    public void clear() {
        bukets = new ArrayList[capacity];
        for (int i = 0; i < capacity; i++) {
            bukets[i] = new ArrayList<>();
        }
    }
}
