package dataAccess.Conceretes;

import dataAccess.Abstracts.CourseDao;
import entity.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {

		System.out.println("Hibernate ile eklendi : " + course.getName());
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

}
