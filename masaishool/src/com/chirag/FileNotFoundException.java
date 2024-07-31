package com.chirag;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException() {
    }

    public FileNotFoundException(String message) {
//        super(message);
        System.out.println("filenotfound");
    }
}
