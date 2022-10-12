package dataAccess.Conceretes;

import dataAccess.Abstracts.InstructorDao;
import entity.Instructor;

public class JdbcInsturctorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {

		System.out.println("Jdbc ile eklendi : " + instructor.getFirstName());
	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

}
