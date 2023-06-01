package com.blogspot.dastinsandura.hashmap;

public class SimpleHashMapNode<K, V> {

    K key;

    V value;

    SimpleHashMapNode<K,V> next;

    public SimpleHashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
