package com.luv2code.demo.rest;

public class StudentNotFoundException extends RuntimeException{

    // Development Process

    /*
        1. Create a custom error response class
        2. Create a custom exception class
        3. Update REST service to throw exception if student not found
        4. Add an exception handler using @ExceptionHandler

     */


    // Right Click -> Generate -> Constructor -> 2-3-4
    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
