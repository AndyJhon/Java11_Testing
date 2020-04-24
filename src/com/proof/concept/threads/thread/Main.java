package com.proof.concept.threads.thread;

public class Main {
    public static void main(String[] args) {
        ThreadExample threadExample1 = new ThreadExample();
        threadExample1.setName("Thread 1");
        threadExample1.start();

        ThreadExample threadExample2 = new ThreadExample();
        threadExample1.setName("Thread 2");
        threadExample2.start();

        System.out.println(Thread.activeCount());
    }
}
