package javaPrep.implementDSFromScratch;

public class MyHashMap<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry<K, V>[] table;
    private int capacity = 16;
    private int size = 0;
    private static final float LOAD_FACTOR = 0.75f;

    public MyHashMap() {
        table = new Entry[capacity];
    }

    public void put(K key, V value) {
        int index = hash(key);
        Entry<K, V> head = table[index];

        // Check if key already exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value; // update
                return;
            }
            head = head.next;
        }

        // Insert new entry at head of the list
            // Collision Handling here!
        Entry<K, V> newNode = new Entry<>(key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;

        // Resize if needed
        if ((float) size / capacity >= LOAD_FACTOR) {
            resize();
        }
    }

    public V get(K key) {
        int index = hash(key);
        Entry<K, V> head = table[index];
        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        Entry<K, V> head = table[index];
        Entry<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    table[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    private void resize() {
        capacity *= 2;
        Entry<K, V>[] oldTable = table;
        table = new Entry[capacity];
        size = 0;

        for (Entry<K, V> head : oldTable) {
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }
}
