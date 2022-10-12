package business.Conceretes;

import business.Abstracts.CategoryCheckService;
import business.Abstracts.CategoryService;
import core.Logging;
import dataAccess.Abstracts.CategoryDao;
import entity.Category;

public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	private Logging[] loggers;
	private CategoryCheckService categoryCheckService;

	public CategoryManager(CategoryDao categoryDao, Logging[] loggers, CategoryCheckService categoryCheckService) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categoryCheckService = categoryCheckService;
	}

	@Override
	public void add(Category category) throws Exception {

		if(categoryCheckService.checkCategory(category)) {
			categoryDao.add(category);
			Utils.runLogging(loggers, category.getName());
		}else {
			throw new Exception("Category addition failed !");
		}
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub

	}

}
