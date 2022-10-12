package business.Abstracts;

import entity.Category;

public interface CategoryCheckService {

	boolean checkCategory(Category category) throws Exception;
}
