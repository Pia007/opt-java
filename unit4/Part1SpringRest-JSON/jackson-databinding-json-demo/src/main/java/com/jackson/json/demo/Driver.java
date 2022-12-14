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

            // print out address: street and city
            Address tempAddress = theStudent.getAddress();

            System.out.println("Street: " + tempAddress.getStreet());
            System.out.println("City: " + tempAddress.getCity());

            // print languages, it's and array
             for (String tempLang : theStudent.getLanguages()) {
                 System.out.println(tempLang);
             }
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
// Ignoring Properties
    // if new properties are added to JSON ---> error if code is not updated
    // modify code to ignore new properties
    // Test : add a new property to sample-full.JSON
        // "company": "Acme Inc"  and run app ---> error..."not marked as ignorable"
    // annotate Student class with @JsonIgnoreProperties(ignoreUnknown = true)
        // run app ---> no error