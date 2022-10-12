package dataAccess.Conceretes;

import dataAccess.Abstracts.CategoryDao;
import entity.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {

		System.out.println("Jdbc ile eklendi : " + category.getName());
	}

	@Override
	public void delete(Category cateogry) {
		// TODO Auto-generated method stub
		
	}

}
