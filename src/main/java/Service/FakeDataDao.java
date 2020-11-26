package Service;

import Entity.Student;

import java.util.Collection;

public interface FakeDataDao {
    //gets the collection of students from hashmap and return
    Collection<Student> getAllStudents();

    //get student by id
    Student getStudentsById(int id);

    //removes student from database
    void removeStudentById(int id);

    //update student
    void updateStudent(Student student);

    //insert student to database
    void insertStudent(Student student);
}
