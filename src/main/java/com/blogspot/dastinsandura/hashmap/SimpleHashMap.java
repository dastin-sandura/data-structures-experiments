package com.blogspot.dastinsandura.hashmap;

public class SimpleHashMap<K, V> {

    private static final int DEFAULT_SIZE = 10;

    private int size;

    private final SimpleHashMapNode<K, V>[] nodes;

    public SimpleHashMap() {
        nodes = new SimpleHashMapNode[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (nodes[index] == null) {
            nodes[index] = new SimpleHashMapNode<>(key, value);
        } else {
            System.err.println("There is already a value for key " + key + " which corresponds to index " + index);
        }
    }

    public V get(K key) {
        SimpleHashMapNode<K, V> node = nodes[hash(key)];
        return node == null ? null : node.value;
    }

    public int hash(K key) {
        return key.hashCode() % size;
    }

}
