package com.fil.lib.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fil.lib.dao.BookDao;
import com.fil.lib.dao.impl.BookDaoImpl;
import com.fil.lib.model.Book;
import com.fil.lib.service.BookService;

public class BookServiceImpl implements BookService
{
	private BookDao bookDao = new BookDaoImpl();
	@Override
	public Book findById(int itemId)
	{
		return bookDao.findById(itemId);
	}

	@Override
	public List<Book> findByAuthor(String author)
	{
		return bookDao.findByAuthor(author);
	}

	@Override
	public List<Book> findByTitle(String title)
	{
		return bookDao.findByTitle(title);
	}

	@Override
	public boolean removeById(int itemId)
	{
		return bookDao.removeById(itemId);
	}

	@Override
	public Book update(Book book)
	{
		return bookDao.update(book);
	}

	@Override
	public Book add(Book book)
	{
		return bookDao.add(book);
	}

	@Override
	public List<Book> add(Book book, int count)
	{
		List<Book> list = new ArrayList<>();
		for(int i = 1; i<=count; i++)
		{
			Book newBook = new Book();
			copyData(newBook, book);
			bookDao.add(newBook);
			list.add(newBook);
		}
		return list;
	}

	private void copyData(Book newBook, Book book)
	{
		newBook.setAuthor(book.getAuthor());
		newBook.setBookId(book.getBookId());
		newBook.setPublisher(book.getPublisher());
		newBook.setTitle(book.getTitle());
	}

}
