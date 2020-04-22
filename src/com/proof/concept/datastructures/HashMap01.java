package com.proof.concept.datastructures;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap =new HashMap<String, Integer>();
        hashMap.put("Andy", 12);
        hashMap.put("Jhonell", 1);
        hashMap.put("Jarvis", 156);
        hashMap.put("Jarvis", 222); // override value

        if (hashMap.containsKey("Jarvis")) {
            hashMap.remove("Jarvis");
        }

        System.out.println(hashMap);

        hashMap.clear();

        System.out.println(hashMap);
    }
}
