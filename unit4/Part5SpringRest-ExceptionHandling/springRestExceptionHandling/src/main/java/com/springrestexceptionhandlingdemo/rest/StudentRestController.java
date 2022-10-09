package com.springrestexceptionhandlingdemo.rest;

import com.springrestexceptionhandlingdemo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Roger", "Parrish"));
        theStudents.add(new Student("Neema", "Vidal"));
        theStudents.add(new Student("Steve", "White"));
        theStudents.add(new Student("Marge", "Artister"));
        theStudents.add(new Student("Larry", "Davidson"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    // update REST service to trow exception
    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId) {

        // check student id vs list size or if student id < 0
        if ( (studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found: " + studentId);
        }

        // studentId is the index from the list
        return theStudents.get(studentId);
    }

    // Moved to StudentRestExceptionHandler for Global Exception Handling implementation
    // Add an exception handler using @ExceptionHandler
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {
//
//        StudentErrorResponse error = new StudentErrorResponse();
//
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setMessage(exception.getMessage());
//        error.setTimestamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }
//
//
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {
//
//        StudentErrorResponse error = new StudentErrorResponse();
//
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setMessage(exception.getMessage());
//        error.setTimestamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//    }
}
