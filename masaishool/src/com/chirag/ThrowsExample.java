package com.chirag;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample {
    // Method that declares it can throw FileNotFoundException and IOException
    public static void readFile() throws FileNotFoundException, IOException {
        String filePath = "C:\\Users\\Masai\\IdeaProjects\\masaishool\\src\\com\\chirag\\text.text";
        File file = new File(filePath);
        // Check if the file exists; throw an exception if it does not
//        if (!file.exists()) {
        throw new FileNotFoundException("File not found at path: chirag ");
//        }

    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Caught the exception:" + e.getMessage());
            // Optionally, you can throw a RuntimeException or handle it as needed
            throw new RuntimeException("Error reading the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught the exception: " + e.getMessage());
            // Optionally, you can throw a RuntimeException or handle it as needed
            throw new RuntimeException("Error reading the file: " + e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}