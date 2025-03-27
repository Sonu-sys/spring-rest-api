package net.javaguides.Springboot_.controller;

import net.javaguides.Springboot_.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent()
    {
       Student student =new Student(
              id:1,
        firstName:"Sonu",
        lastName:"Khatri"

       );
       return student;

    }

    public List<Student> getAllStudent(){
        List<Student> students= new ArrayList<>();
        Students.add(new Student(id:1,firstName:'Sonu',lastName:"Khatri"));
        Student.add(new Student(id:2,firstName:"Sanu",lastName:"Bhandari"))
    }
}
