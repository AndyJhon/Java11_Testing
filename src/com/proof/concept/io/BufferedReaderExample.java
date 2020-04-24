package com.proof.concept.io;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        File myFile = new File("testFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(myFile));

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
