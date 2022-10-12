package business.Conceretes;

import java.util.List;

import business.Abstracts.CourseCheckService;
import entity.Course;

public class CourseCheckManager implements CourseCheckService {

	private List<Course> courses;

	public CourseCheckManager(List<Course> courses) {
		super();
		this.courses = courses;
	}

	@Override
	public boolean checkCourse(Course course) throws Exception {

		
		for (Course course2 : courses) {
			if(course2.getName()==course.getName()) {
				throw new Exception("Kurs ismi ayný olamaz !");
			}
		}
		
		
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatý 0'dan düþük olamaz !");
		}
		
		courses.add(course);
		return true;
	}



	

}
