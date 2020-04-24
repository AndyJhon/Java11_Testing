package com.proof.concept.threads.synchronization;

public class ATM {

    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if((balance - amount) < 0) {
            System.out.println("Transaction denied");
        }else {
            account.debit(amount);
            System.out.println("$"+amount+" successfully withdraw");
        }
        System.out.println("Current balance: " + account.getBalance());
    }
}
