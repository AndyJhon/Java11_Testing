package com.proof.concept.datastructures;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add(1, "C");
        System.out.println(linkedList1);
        linkedList1.remove("B"); // or remove by index
        System.out.println(linkedList1);
    }
}
