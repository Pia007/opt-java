package com.springrestexceptionhandlingdemo.rest;

public class StudentNotFoundException extends RuntimeException {

    // generate constructor from the super class
    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
