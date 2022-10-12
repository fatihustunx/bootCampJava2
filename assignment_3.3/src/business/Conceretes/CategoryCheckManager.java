package business.Conceretes;

import java.util.List;

import business.Abstracts.CategoryCheckService;
import entity.Category;

public class CategoryCheckManager implements CategoryCheckService {

	private List<Category> categories;

	public CategoryCheckManager(List<Category> categories) {
		super();
		this.categories = categories;
	}

	@Override
	public boolean checkCategory(Category category) throws Exception {

		if(categories==null) {
			categories.add(category);
			return true;
		}else {
			for (Category category2 : categories) {
				if(category2.getName()==category.getName()) {
					throw new Exception("Kategori ismi ayný olamaz !");
				}
			}
		}
		categories.add(category);
		return true;
	}

}
