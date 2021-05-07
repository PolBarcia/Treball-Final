package com.example.findbook.service;

import com.example.findbook.entities.Books;

import java.util.List;

public interface BooksService {

	String saveProduct(Books product);

	List<Books> findAllProducts();
	
	List<Books> findAllProductsForAdmin();

	Books findProductById(Integer id);

	String deleteProduct(Integer id);

	String updateProduct(Books product);

	List<Books> findProductByCategoryId(Integer categoryId);

	Books findProductByIdForAdmin(int id);
	

}
