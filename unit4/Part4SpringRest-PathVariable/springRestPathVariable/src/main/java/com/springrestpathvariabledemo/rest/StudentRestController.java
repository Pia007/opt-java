package com.springrestpathvariabledemo.rest;

import com.springrestpathvariabledemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define field, add data and to prevent adding data repeatedly
    private List<Student> theStudents;

    // use @PostConstruct to load student data
        // called only once when this bean is constructed
        // create the list and populate it with students
    @PostConstruct
    public void loadData() {

        // initializing theStudents as an empty list
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Roger", "Parrish"));
        theStudents.add(new Student("Neema", "Vidal"));
        theStudents.add(new Student("Steve", "White"));
        theStudents.add(new Student("Marge", "Artister"));
        theStudents.add(new Student("Larry", "Davidson"));
    }

    // define endpoint for "/students - returns a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    // define endpoint for a retrieving a single student
    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId) {

        // studentId is the index from the list
        return theStudents.get(studentId);
    }
}
