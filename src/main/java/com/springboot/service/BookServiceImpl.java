package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.domain.Book;
import com.springboot.repository.BookRepository;

public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBookList() {
		// TODO Auto-generated method stub
		return bookRepository.getAllBookList();
	}

}
