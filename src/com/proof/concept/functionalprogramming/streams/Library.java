package com.proof.concept.functionalprogramming.streams;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> {
           return  book.getAuthor().startsWith("A");
        }).forEach(System.out::println);

        ArrayList<Book> books1 = populateLibrary();
        books1.parallelStream().filter(book -> {
            return  book.getAuthor().startsWith("A");
        }).forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("WS","Romeo y Julieta"));
        books.add(new Book("Cesar Vallejo","Los Heraldos negros"));
        books.add(new Book("Arthur Connan Doyle","Sherlok Holmes"));

        return books;
    }
}
