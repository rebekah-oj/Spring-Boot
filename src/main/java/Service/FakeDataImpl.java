package Service;

import Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
@Qualifier("FakeData")
//class that gives us data from any desired database
public class FakeDataImpl implements FakeDataDao {

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

        //get student by id from database
        public Student getStudentsById(int id){
            return this.students.get(id);
        }

        //delete student by id from database
        public void removeStudentById(int id) {
            this.students.remove(id);
        }

        //update student in database
        public void updateStudent(Student student){
            Student s = students.get(student.getId());
            s.setCourse(student.getCourse());
            s.setName(student.getName());
            students.put(student.getId(), student);
        }

    @Override
    public void insertStudent(Student student) {

    }

    //insert student into database
        public void insertStudentToDatabase(Student student) {
            this.students.put(student.getId(), student);
        }

}
