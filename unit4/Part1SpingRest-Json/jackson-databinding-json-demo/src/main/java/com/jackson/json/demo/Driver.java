package com.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {

        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper ();

            // read JSON file and map/convert to Java POJO: data/sample-full.json
            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            // print first name and last name
            System.out.println("First name = " + theStudent.getFirstName());
            System.out.println("Last name = " + theStudent.getLastName());

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}

// Sample-full.json
    // has a nested obj and an array
    // will cause an error if code is not modified nested objs
    // need to create a new class for the address
