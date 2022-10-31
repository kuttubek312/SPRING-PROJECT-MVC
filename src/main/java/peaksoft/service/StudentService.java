package peaksoft.service;
import java.util.List;
import peaksoft.model.Student;

public interface StudentService {

    Student saveStudent(Student student);

    void removeStudentById(Long id);

    Student getById(Long id);

    List<Student> getAllStudent();

    void updateStudent(Long id,Student student);
}
