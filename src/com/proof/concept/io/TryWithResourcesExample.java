package com.proof.concept.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new StringReader("Jarvis"));
             StringWriter stringWriter = new StringWriter();) {

            stringWriter.write(reader.readLine());
            System.out.println(stringWriter.toString());;
        }catch (IOException e) {

        }
    }
}
