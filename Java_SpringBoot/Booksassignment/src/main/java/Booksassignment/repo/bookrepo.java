package Booksassignment.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Booksassignment.models.Book;


@Repository
public interface bookrepo extends CrudRepository <Book, Long>{
		 List<Book> findAll();
		 List<Book> findByDescriptionContaining(String search);
		 Long countByTitleContaining(String search);
		 Long deleteByTitleStartingWith(String search);
		}
		
