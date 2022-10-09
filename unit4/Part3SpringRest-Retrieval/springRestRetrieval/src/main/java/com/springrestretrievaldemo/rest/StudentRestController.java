package com.springrestretrievaldemo.rest;

import com.springrestretrievaldemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students - returns a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        // create sample students
        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Roger", "Parrish"));
        theStudents.add(new Student("Neema", "Vidal"));
        theStudents.add(new Student("Steve", "White"));
        theStudents.add(new Student("Marge", "Artister"));
        theStudents.add(new Student("Larry", "Davidson"));

        return theStudents;
    }
}
