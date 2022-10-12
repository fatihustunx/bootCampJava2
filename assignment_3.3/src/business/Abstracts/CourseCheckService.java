package business.Abstracts;

import entity.Course;

public interface CourseCheckService {

	boolean checkCourse(Course course) throws Exception;
}
