package com.proof.concept.datastructures.queue;

public class Customer {
    private boolean hasBeeServed;
    private String name;

    public Customer(String name) {
        this.hasBeeServed = false;
        this.name = name;
    }

    public void serve() {
        this.hasBeeServed = true;
        System.out.println(name + " has been served");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
