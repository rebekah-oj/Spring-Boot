package Dao;

import Entity.Student;
import Service.FakeDataDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("MongoData")
public class MongoStudentDaoImpl implements FakeDataDao {

    //gets the collection of students from hashmap and return
    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    //get student by id
    @Override
    public Student getStudentsById(int id) {
        return null;
    }

    //removes student from database
    @Override
    public void removeStudentById(int id) {

    }

    //update student
    @Override
    public void updateStudent(Student student) {

    }

    //insert student to database
    @Override
    public void insertStudent(Student student) {

    }
}
