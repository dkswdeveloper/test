package com.fil.lib.dao;

import java.util.List;

import com.fil.lib.model.Book;

//connects to db and gets the data of book, converts data to object
// to save object, gets data from object & saves to db
public interface BookDao
{
	public Book findById(int itemId);
	public List<Book> findByAuthor(String author); //by default public
	public List<Book> findByTitle(String title);
	public boolean removeById(int itemId);
	public Book update(Book book);
	Book add(Book book);
}
