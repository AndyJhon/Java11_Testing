package com.proof.concept.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics02 {
    static Character[] characters = {'h','e','l','l','o'};
    static Integer[] integers = {1, 2, 3, 4, 5};
    static Boolean[] booleans = {true, false, true};

    public static void main(String[] args) {
        arrayToList(characters);
        arrayToList(integers);
        arrayToList(booleans);
    }

    public static List arrayToList(Object[] array){
        List<Object> list = new ArrayList<>();

        for (Object o:array) {
            list.add(o);
        }

        list.forEach(x -> System.out.println(x));

        return list;
    }
}
