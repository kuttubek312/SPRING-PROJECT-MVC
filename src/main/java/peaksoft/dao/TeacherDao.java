package peaksoft.dao;

import java.util.List;
import peaksoft.model.Teacher;

public interface TeacherDao {

    Teacher saveTeacher(Teacher teacher);

    void removeTeacherById(Teacher teacher);

    Teacher getById(Long id);

    List<Teacher> getAllTeacher();

    void updateTeacher(Long id,Teacher teacher);
}
