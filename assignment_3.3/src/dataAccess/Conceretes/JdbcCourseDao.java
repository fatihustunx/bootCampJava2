package dataAccess.Conceretes;

import dataAccess.Abstracts.CourseDao;
import entity.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {

		System.out.println("Jdbc ile eklendi : " + course.getName());
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

}
