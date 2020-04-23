package com.proof.concept.datastructures;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap01 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(4, 0.75f, true);// capacity, loadFactor, accessOrder
        linkedHashMap.put("A", 1212);
        linkedHashMap.put("B", 1);
        linkedHashMap.put("C", 32);
        linkedHashMap.put("D", 156);

        System.out.println("A number is: " + linkedHashMap.get("A"));

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
