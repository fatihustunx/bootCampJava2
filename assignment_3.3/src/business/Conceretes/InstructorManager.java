package business.Conceretes;

import business.Abstracts.InstructorService;
import core.Logging;
import dataAccess.Abstracts.InstructorDao;
import entity.Instructor;

public class InstructorManager implements InstructorService {

	private InstructorDao instructorDao;
	private Logging[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logging[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Instructor instructor) {

		instructorDao.add(instructor);
		Utils.runLogging(loggers, instructor.getFirstName());

	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub

	}

}
