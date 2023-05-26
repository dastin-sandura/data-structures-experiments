package com.blogspot.dastinsandura;

import com.blogspot.dastinsandura.hashmap.SimpleHashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SimpleHashMap<String, String> simpleHashMap = new SimpleHashMap<>();
        System.out.println(simpleHashMap.hash("Heyo"));

        simpleHashMap.put("1", "One");
        simpleHashMap.put("2", "Two");
        simpleHashMap.put("3", "Three");
        simpleHashMap.put("1", "Uno"); // should support overwriting value

        System.out.println(simpleHashMap.get("1"));
        System.out.println(simpleHashMap.get("2"));
        System.out.println(simpleHashMap.get("3"));

        System.out.println(simpleHashMap.get("4"));

    }
}