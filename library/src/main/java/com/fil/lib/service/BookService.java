package com.fil.lib.service;

import java.util.List;

import com.fil.lib.model.Book;

public interface BookService
{
	public Book findById(int itemId);
	public List<Book> findByAuthor(String author); //by default public
	public List<Book> findByTitle(String title);
	public boolean removeById(int itemId);
	public Book update(Book book);
	Book add(Book book);
	List<Book> add(Book book, int count);
}
