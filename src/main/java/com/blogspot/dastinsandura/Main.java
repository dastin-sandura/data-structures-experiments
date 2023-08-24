package com.blogspot.dastinsandura;

import com.blogspot.dastinsandura.hashmap.SimpleHashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SimpleHashMap<String, String> simpleHashMap = new SimpleHashMap<>();
        System.out.println(simpleHashMap.hash("Heyo"));

        populateHashMap(simpleHashMap);

//        printMap(simpleHashMap);

//        Set<String> keySet = simpleHashMap.getKeySet();
//        ArrayList<String>a = new ArrayList<>(keySet);
//        System.err.println(a.get(0));
//        System.err.println(a.get(1));
//        System.err.println(a.get(2));
//        System.out.println(simpleHashMap.get("1"));
//        System.out.println(simpleHashMap.get("2"));
//        System.out.println(simpleHashMap.get("3"));
//
//        System.out.println(simpleHashMap.get("4"));

        byte b = 127; // range of 256 (2^8)
        short s;
        int i;
        long l = 123;
        float f = 123.1f;
        double d = 123.1;
        boolean bo;
        char c;

        List<String> la = new ArrayList<String>();
        Stream data =
                la.stream().filter(e -> e.isEmpty());
        data.collect(Collectors.toList());
        data.collect(Collectors.toList());

    }

    private static void printMap(SimpleHashMap<String, String> map) {
        for (String s : map.getKeySet()) {
            System.out.println("[" + s + " = " + map.get(s) + "]");
        }
    }

    private static void populateHashMap(SimpleHashMap<String, String> simpleHashMap) {
        simpleHashMap.put("1", "16");
        simpleHashMap.put("2", "15");
        simpleHashMap.put("3", "14");
        simpleHashMap.put("4", "13");
        simpleHashMap.put("5", "12");
        simpleHashMap.put("6", "11");
        simpleHashMap.put("7", "10");
        simpleHashMap.put("8", "9");
        simpleHashMap.put("9", "8");
        simpleHashMap.put("10", "7");
        simpleHashMap.put("11", "6");
        simpleHashMap.put("12", "5");
        simpleHashMap.put("13", "4");
        simpleHashMap.put("14", "3");
        simpleHashMap.put("15", "2");
        simpleHashMap.put("16", "1");

//        simpleHashMap.put("1", "Uno"); // should support overwriting value
    }
}