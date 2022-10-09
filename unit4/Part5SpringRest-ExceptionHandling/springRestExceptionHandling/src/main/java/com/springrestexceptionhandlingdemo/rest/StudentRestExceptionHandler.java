package com.springrestexceptionhandlingdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Global Exception Handling
@ControllerAdvice
public class StudentRestExceptionHandler {

    // add exception handling code from REST service
    // Add an exception handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {

        // create a StudentErrorResponse - call the constructor to create a new response called error
        StudentErrorResponse error = new StudentErrorResponse();

        // set the status to 404 Not found
        error.setStatus(HttpStatus.NOT_FOUND.value());

        // set the message to the exceptions message
        error.setMessage(exception.getMessage());

        // set the timestamp
        error.setTimestamp(System.currentTimeMillis());

        // return ResponseEntity
            // create a new ResponseEntity
            // pass in the actual error(the body of the response)
            // pass in the status code
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Add another exception handler to catch any type of exception
        // but pass in the generic exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {

        // create a StudentErrorResponse - call the constructor to create a new response called error
        StudentErrorResponse error = new StudentErrorResponse();

        // change status code to reflect a bad request
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exception.getMessage());  // cannot provide a plain text message here if desired
        error.setTimestamp(System.currentTimeMillis());

        // change status code to reflect a bad request
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
