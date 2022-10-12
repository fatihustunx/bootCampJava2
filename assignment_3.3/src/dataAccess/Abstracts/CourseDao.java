package dataAccess.Abstracts;

import entity.Course;

public interface CourseDao {

	void add(Course course);
	void delete(Course course);
}
