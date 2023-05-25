package com.blogspot.dastinsandura.hashmap;

public class SimpleHashMap<K, V> {

    private SimpleHashMapNode<K, V>[] nodes;

    public SimpleHashMap() {
        nodes = new SimpleHashMapNode[10];
    }

    public void put(K key, V value) {

    }

    public int hash(K key) {
        return key.hashCode();
    }

}
