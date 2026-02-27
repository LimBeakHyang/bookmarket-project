package com.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.domain.Book;
import com.springboot.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBookList() {
		// TODO Auto-generated method stub
		return bookRepository.getAllBookList();
	}
	
	public Book getBookById(String bookId) {
		Book bookById = bookRepository.getBookById(bookId);
		return bookById;
	}
	
	public List<Book> getBookListByCategory(String category) {
		
		List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
		return booksByCategory;
	}

}
