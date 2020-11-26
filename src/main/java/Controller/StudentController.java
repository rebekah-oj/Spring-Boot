package Controller;

import Entity.Student;
import Service.FakeDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
//define pattern for url
@RequestMapping("/students")
//class offloads the request to student service
public class StudentController {

    @Autowired
    //create instance of StudentService
    private FakeDataDao fakeDataDao;

    @RequestMapping(method = RequestMethod.GET)
    //gets the collection of students from hashmap and return
    public Collection<Student> getAllStudents() {
        return fakeDataDao.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //get student by id
    public Student getStudentsById(@PathVariable int id) {
        return fakeDataDao.getStudentsById(id);
    }

    //remove student from database
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable int id) {
        fakeDataDao.removeStudentById(id);
    }

    //update student in database
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentById(@RequestBody Student student) {
        fakeDataDao.updateStudent(student);
    }

    //insert student into database
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student) {
        fakeDataDao.insertStudent(student);
    }
}
