package business.Conceretes;

import business.Abstracts.CourseCheckService;
import business.Abstracts.CourseService;
import core.Logging;
import dataAccess.Abstracts.CourseDao;
import entity.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private Logging[] loggers;
	private CourseCheckService courseCheckService;

	public CourseManager(CourseDao courseDao, Logging[] loggers, CourseCheckService courseCheckService) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courseCheckService = courseCheckService;
	}

	@Override
	public void add(Course course) throws Exception {

		if(courseCheckService.checkCourse(course)) {
			courseDao.add(course);
			Utils.runLogging(loggers, course.getName());
		}else {
			throw new Exception("Course addition failed !");
		}
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub

	}

}
