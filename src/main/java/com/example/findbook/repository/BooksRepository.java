package com.example.findbook.repository;

import com.example.findbook.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("booksRepository")
public interface BooksRepository extends JpaRepository<Books, Integer> {

	List<Books> findProductByCategoryId(Integer categoryId);

}
