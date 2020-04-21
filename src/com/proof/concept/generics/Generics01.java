package com.proof.concept.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics01 {
    public static void main (String[] args) {
        List names = new ArrayList();
        names.add("name");
        String name1 = (String)names.get(0);//We need to force cast
        System.out.println(name1);

        //Compiler checks
        List<String> lastNames = new ArrayList();
        lastNames.add("lastname");
        String lastName1 = lastNames.get(0);//We do not need to force cast
        System.out.println(lastName1);
    }
}
