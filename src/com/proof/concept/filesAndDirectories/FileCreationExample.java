package com.proof.concept.filesAndDirectories;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) throws IOException {
        File myFile = new File("home\\andyjhonvr\\Desktop\\myTestFile");
        boolean fileCreated = myFile.createNewFile();
        System.out.println(fileCreated? "Created" : "Error");
    }
}
