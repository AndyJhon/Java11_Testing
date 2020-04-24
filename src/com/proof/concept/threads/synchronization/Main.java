package com.proof.concept.threads.synchronization;

public class Main {
    static final BankAccount bankaccount1 = new BankAccount(50);
    public static void main(String[] args) {

        bankaccount1.topUp(100);

        Thread t1 = new Thread(() -> {
           ATM.withdraw(bankaccount1,10);
        });

        Thread t2 = new Thread(() -> {
            ATM.withdraw(bankaccount1,100);
        });

        t1.start();
        t2.start();
    }
}
