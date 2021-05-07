package com.example.findbook.service;



import com.example.findbook.entities.Category;

import java.util.List;

public interface CategoryService {

	String saveCategory(Category category);

	List<Category> findAllCategories();

	Category findCategoryById(Integer id);

	String deleteCategory(Integer id);

	String updateCategory(Category branch);

}
