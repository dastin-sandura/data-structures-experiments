package com.blogspot.dastinsandura;

import com.blogspot.dastinsandura.hashmap.SimpleHashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SimpleHashMap<String, String> simpleHashMap = new SimpleHashMap<>();
        System.out.println(simpleHashMap.hash("Heyo"));

    }
}