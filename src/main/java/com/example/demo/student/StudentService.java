package com.example.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// Must be a spring bean
//@Service and @component are the same thing, helps readability
@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Kevin",
                        "Kevin.Jolley@gmail.com",
                        LocalDate.of(1994, Month.SEPTEMBER, 24),
                        26
                )
        );
    }
}
