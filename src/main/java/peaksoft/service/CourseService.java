package peaksoft.service;
import java.util.List;
import peaksoft.model.Course;

public interface CourseService {

    Course saveCourse(Course course);

    void removeCourseById(Long id);

    Course getById(Long id);

    List<Course> getAllCourse();

    void updateCourse( Course course);
}
