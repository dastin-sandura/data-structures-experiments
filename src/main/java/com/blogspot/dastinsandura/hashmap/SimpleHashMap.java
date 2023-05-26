package com.blogspot.dastinsandura.hashmap;

import java.util.HashSet;
import java.util.Set;

public class SimpleHashMap<K, V> {

    private static final int DEFAULT_SIZE = 3;

    private int size;

    private final SimpleHashMapNode<K, V>[] nodes;

    public SimpleHashMap() {
        nodes = new SimpleHashMapNode[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public SimpleHashMap(int size) {
        nodes = new SimpleHashMapNode[size];
        this.size = size;
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

    public Set<K> getKeySet(){
        Set<K> keySet = new HashSet<>();
        for (SimpleHashMapNode<K,V> n : nodes) {
            keySet.add(n.key);
        }
        return keySet;
    }

}
