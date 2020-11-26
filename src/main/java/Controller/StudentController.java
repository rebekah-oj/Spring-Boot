package Controller;

import Entity.Student;
import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
//define pattern for url
@RequestMapping("/students")
//class offloads the request to student service
public class StudentController {

    @Autowired
    //create instance of StudentService
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    //gets the collection of students from hashmap and return
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //get student by id
    public Student getStudentsById(@PathVariable{"id"} int id){
        return studentService.getStudentsById(id);
    }
}
