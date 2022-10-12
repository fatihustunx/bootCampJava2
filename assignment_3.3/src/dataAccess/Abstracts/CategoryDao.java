package dataAccess.Abstracts;

import entity.Category;

public interface CategoryDao {

	void add(Category category);
	void delete(Category cateogry);
}
