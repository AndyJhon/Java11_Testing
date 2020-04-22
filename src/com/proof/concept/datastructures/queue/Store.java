package com.proof.concept.datastructures.queue;

import javax.sound.sampled.Line;
import java.util.LinkedList;

public class Store {
    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Carlos"));
        queue.add(new Customer("Andy"));
        queue.add(new Customer("Jorge"));
        queue.add(new Customer("Richard"));
        queue.add(new Customer("Marco"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue) {
        Customer c = queue.poll();
        c.serve();
    }
}
