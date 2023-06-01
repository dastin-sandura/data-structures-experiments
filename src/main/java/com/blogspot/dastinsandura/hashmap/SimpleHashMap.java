package com.blogspot.dastinsandura.hashmap;

import java.util.HashSet;
import java.util.Set;

public class SimpleHashMap<K, V> {

    private static final int DEFAULT_SIZE = 16;

    private int size;

    private int occupiedNodesCount = 0;

    private final SimpleHashMapNode<K, V>[] nodes;

    public SimpleHashMap() {
        nodes = new SimpleHashMapNode[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public SimpleHashMap(int size) {
        nodes = new SimpleHashMapNode[size];
        this.size = size;
    }

    //TODO test implementation of multiple value under one key stored as Linked List
    public void put(K key, V value) {
        int index = hash(key);
        SimpleHashMapNode<K, V> node = nodes[index];
        SimpleHashMapNode<K, V> newNode = new SimpleHashMapNode<>(key, value);
        if (node == null) {
            nodes[index] = newNode;
            occupiedNodesCount++;
        } else {
            System.out.println("!!There is already a value for key " + key + " which corresponds to index " + index);
            node.next = newNode;
        }
        float percentage = (float)occupiedNodesCount/size;
        System.out.println("Occupied " + occupiedNodesCount + " out of " + size + " which is " + percentage*100);
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
    //TODO implement rehashing
    private void rehashStructure() {

    }

}
