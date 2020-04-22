package com.proof.concept.functionalprogramming;

public class Main {
    public static void main(String[] args) {
        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Congrats :" +name);
            }
        };
        greetingMessage.greet("Andy");

        GreetingMessage greetingMessage1 = (name) -> {
            System.out.println("Congrats :" +name);
        };
        greetingMessage.greet("Adri");
    }
}
