package com.jackson.json.demo;

public class Student {

    // fields
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;

    // add field for nested address obj
    private Address address;

    // add field for languages array
    private String[] languages;

    // no arg-constructors
    public Student () {

    }

    // getter and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // add getter and setter for address and languages
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}

// Add field, getter and setters for address obj and languages array
