package Dao;

import Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//lets spring know that it is a repository
@Repository
//class that gives us data from any desired database
public class StudentDao {

    private static Map<Integer, Student> students;

    //initialize in static block
    static {
        students = new HashMap<Integer, Student>() {
            {

                put(1, new Student(1, "Said", "Computer Science"));
                put(2, new Student(2, "Alexis O", "Finance"));
                put(3, new Student(3, "Anne", "Maths"));

            }

        };
    }

    //get information using methods

    //gets the collection of students from hashmap and return
    public Collection<Student> getAllStudents(){
      return this.students.values();
    }

    //get student by id
    public Student getStudentsById(int id){
        return this.students.get(id);
    }
}
