package business.Abstracts;

import entity.Course;

public interface CourseService {

	void add(Course course) throws Exception;
	void delete(Course course);
}
