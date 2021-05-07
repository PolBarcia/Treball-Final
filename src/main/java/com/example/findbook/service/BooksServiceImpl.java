package com.example.findbook.service;

import java.util.ArrayList;
import java.util.List;

import com.example.findbook.entities.Books;
import com.example.findbook.repository.BooksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



@Service("booksService")
public class BooksServiceImpl implements BooksService {

	@Qualifier("booksRepository")
	@Autowired
	private BooksRepository booksRepository;

	@Override
	public String saveProduct(Books product) {
		// TODO Auto-generated method stub
		booksRepository.saveAndFlush(product);
		return "Product Added Sucessfully";
	}

	@Override
	public List<Books> findAllProducts() {
		try {
			List<Books> products = new ArrayList<>();
			List<Books> productsCopy = new ArrayList<>();
			booksRepository.findAll().forEach(products::add);
			productsCopy.addAll(products);
			for (Books p : products) {
				if (!p.isActive()) {
					productsCopy.remove(p);
				}
			}
			return productsCopy;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Books findProductById(Integer id) {
		// TODO Auto-generated method stub
		Books product = booksRepository.getOne(id);
		if (!product.isActive())
			product = null;

		return product;
	}

	@Override
	public String deleteProduct(Integer id) {

		Books product = booksRepository.getOne(id);

		product.setActive(false);
		booksRepository.saveAndFlush(product);

		return "Product Deleted Sucessfully";
	}

	@Override
	public String updateProduct(Books product) {
		// TODO Auto-generated method stub
		booksRepository.saveAndFlush(product);
		return "Product Updated Sucessfully";
	}

	@Override
	public List<Books> findProductByCategoryId(Integer categoryId) {
		// TODO Auto-generated method stub
		List<Books> products = new ArrayList<>();
		List<Books> productsCopy = new ArrayList<>();
		booksRepository.findProductByCategoryId(categoryId).forEach(products::add);
		productsCopy.addAll(products);
		for (Books p : products) {
			if (!p.isActive()) {
				productsCopy.remove(p);
			}
		}
		return productsCopy;
	}

	@Override
	public List<Books> findAllProductsForAdmin() {
		List<Books> products = new ArrayList<>();
		booksRepository.findAll().forEach(products::add);
		return products;
	}

	@Override
	public Books findProductByIdForAdmin(int id) {
		// TODO Auto-generated method stub
		Books product = booksRepository.getOne(id);
		return product;
	}

}
