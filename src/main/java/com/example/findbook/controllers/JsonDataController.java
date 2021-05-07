package com.example.findbook.controllers;


import com.example.findbook.entities.Books;
import com.example.findbook.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	@Qualifier("booksService")
	private BooksService productService;

	@GetMapping("/all/products")
	public List<Books> getAllProducts() {
		List<Books> products = productService.findAllProducts();
		return products;

	}
	
	@GetMapping("/admin/all/products")
	public List<Books> getAllProductsForAdmin() {
		List<Books> products = productService.findAllProductsForAdmin();
		return products;

	}

	@GetMapping("/category/{categoryId}/products")
	public List<Books> getProductsByCategory(@PathVariable("categoryId") int categoryId) {
		List<Books> products = productService.findProductByCategoryId(categoryId);
		return products;

	}

}
