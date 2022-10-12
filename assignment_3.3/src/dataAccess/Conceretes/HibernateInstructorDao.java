package dataAccess.Conceretes;

import dataAccess.Abstracts.InstructorDao;
import entity.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {

		System.out.println("Hibernate ile eklendi : " + instructor.getFirstName());
	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

}
