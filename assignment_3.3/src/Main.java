import java.util.ArrayList;
import java.util.List;

import business.Conceretes.CategoryCheckManager;
import business.Conceretes.CategoryManager;
import business.Conceretes.CourseCheckManager;
import business.Conceretes.CourseManager;
import business.Conceretes.InstructorManager;
import core.DatabaseLogger;
import core.EmailLogger;
import core.Logging;
import dataAccess.Conceretes.HibernateCourseDao;
import dataAccess.Conceretes.JdbcCategoryDao;
import dataAccess.Conceretes.JdbcInsturctorDao;
import entity.Category;
import entity.Course;
import entity.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Logging[] loggers= {new DatabaseLogger(),new EmailLogger()};
		List<Category> categories = new ArrayList<>();
		List<Course> courses= new ArrayList<>();
		
		Instructor instructor= new Instructor(1, "Engin", "Demirog");
		InstructorManager instructorManager= new InstructorManager(new JdbcInsturctorDao(), loggers);
		instructorManager.add(instructor);
		
		Category category= new Category(1, "Programlama");
		Category category2= new Category(2, "Yapay Zeka");
		CategoryManager categoryManager= new CategoryManager(new JdbcCategoryDao(), loggers, new CategoryCheckManager(categories));
		categoryManager.add(category);
		categoryManager.add(category2);
		
		Course course= new Course(1, "Java Camp", "Spring Boot", 12, category, instructor);
		Course course2= new Course(2, "Java Camp React", "Spring Security", 20, category, instructor);
		CourseManager courseManager= new CourseManager(new HibernateCourseDao(), loggers, new CourseCheckManager(courses));
		courseManager.add(course);
		courseManager.add(course2);
		
	}

}
