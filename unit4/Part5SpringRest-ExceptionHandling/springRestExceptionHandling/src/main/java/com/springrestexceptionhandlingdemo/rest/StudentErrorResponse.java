package com.springrestexceptionhandlingdemo.rest;

public class StudentErrorResponse {

    // fields
    private int status;
    private String message;
    private Long timestamp;

    // constructors
    public StudentErrorResponse() {
    }

    public StudentErrorResponse(int status, String message, Long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    // getters and setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
