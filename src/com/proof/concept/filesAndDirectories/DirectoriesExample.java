package com.proof.concept.filesAndDirectories;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class DirectoriesExample {
    public static void main(String[] args) throws IOException {

        FilenameFilter filter = (file, filename) -> {
            return filename.contains(".");
        };

        String[] strings= new File(".").list(filter);
        for (String file: strings) {
            System.out.println(file);
        }

        new File("testDirectory").mkdir();

        Path path = Paths.get("myFile");
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());
        Files.deleteIfExists(path);

        Path path1 = Paths.get("home\\andyjhonvr\\Desktop\\myTestFile");
        Path path2 = Paths.get("home\\andyjhonvr\\Desktop\\myTestFile2");

        Files.copy(path1, path2);
        Files.copy(path1, path2, REPLACE_EXISTING);

    }
}
