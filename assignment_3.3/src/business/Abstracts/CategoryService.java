package business.Abstracts;

import entity.Category;

public interface CategoryService {

	void add(Category category) throws Exception;
	void delete(Category category);
}
