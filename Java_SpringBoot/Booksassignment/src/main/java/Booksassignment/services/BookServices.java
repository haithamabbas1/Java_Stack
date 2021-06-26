package Booksassignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Booksassignment.models.Book;
import Booksassignment.repo.bookrepo;

public class BookServices {
	@Service
	public class BookService {

		private final bookrepo bookRepository;
	 
	 public BookService(bookrepo bookRepository) {
	     this.bookRepository = bookRepository;
	 }
	 
	 public List<Book> allBooks() {
	     return bookRepository.findAll();
	 }
	 // creates a book
	 public Book createBook(Book b) {
	     return bookRepository.save(b);
	 }
	 // retrieves a book
	 public Book findBook(Long id) {
	     Optional<Book> optionalBook = bookRepository.findById(id);
	     if(optionalBook.isPresent()) {
	         return optionalBook.get();
	     } else {
	         return null;
	     }
	 }
	 public Book updateBook(Long id,String title,String desc,String lang,Integer numOfPages) {
		 Book book =findBook(id);
		 
		 book.setTitle(title);
		 book.setDescription(desc);
		 book.setLanguage(lang);
		 book.setNumberOfPages(numOfPages);
		 
		 return bookRepository.save(book);
	 
	 }
	 public void deleteBook(Long id) {
		 Optional<Book> optionalBook = bookRepository.findById(id);
	     if(optionalBook.isPresent()) {
	    	 bookRepository.deleteById(id);
	     } else {
	         System.out.println("book unavailable babeeeeeeeeeeeeeeeeeeeeeeeeee");
	     }
	 }
	 
	}
}
