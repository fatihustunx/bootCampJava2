package dataAccess.Abstracts;

import entity.Instructor;

public interface InstructorDao {

	void add(Instructor instructor);
	void delete(Instructor instructor);
}
