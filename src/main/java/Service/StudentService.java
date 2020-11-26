package Service;

import Dao.StudentDao;
import Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
//business logic happens here
public class StudentService {

    @Autowired
    //get instance of StudentDao
    private StudentDao studentDao;

    //gets the collection of students from hashmap and return
    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    //get student by id
    public Student getStudentsById(int id){
        return studentDao.getStudentsById(id);
    }
}
