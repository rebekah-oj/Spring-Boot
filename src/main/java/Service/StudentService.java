package Service;

import Dao.StudentDaoImpl;
import Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
//business logic happens here
public class StudentService implements FakeDataImpl {

    @Autowired
    @Qualifier("FakeData")
    //get instance of StudentDao
    private StudentDaoImpl studentDaoImpl;

    //gets the collection of students from hashmap and return
    @Override
    public Collection<Student> getAllStudents() {
        return studentDaoImpl.getAllStudents();
    }

    //get student by id
    @Override
    public Student getStudentsById(int id) {
        return studentDaoImpl.getStudentsById(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.studentDaoImpl.removeStudentById(id);
    }

    //update student
    @Override
    public void updateStudent(Student student) {
        this.updateStudent(student);
    }

    @Override
    public void insertStudent(Student student) {
        studentDaoImpl.insertStudentToDatabase(student);
    }
}
