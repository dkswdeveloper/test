package com.fil.lib.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fil.lib.dao.BookDao;
import com.fil.lib.model.Book;

public class BookDaoImpl implements BookDao
{
	private static Map<Integer, Book> map = new HashMap<>();
	//static block
	static
	{
		Book b1 = new Book(1, "Java", "Herbert", "McGraw");
		Book b2 = new Book(1, "Java", "Herbert", "McGraw");
		Book b3 = new Book(1, "Java", "Herbert", "McGraw");
		Book b4 = new Book(2, "DBMS", "Korth", "Person");
		Book b5 = new Book(2, "DBMS", "Korth", "Person");
		Book b6 = new Book(2, "DBMS", "Korth", "Person");
		List<Book> list = List.of(b1,b2,b3,b4,b5,b6);
		list.stream().forEach(bk -> map.put(bk.getItemId(),bk));
	}
	@Override
	public Book findById(int itemId)
	{
		return map.get(itemId);
	}
	@Override
	public List<Book> findByAuthor(String author)
	{
		return map.values().stream()
				.filter(bk -> bk.getAuthor().equals(author))
				.collect(Collectors.toList());
	}
	@Override
	public List<Book> findByTitle(String title)
	{
		return map.values().stream()
				.filter(bk -> bk.getTitle().equals(title))
				.collect(Collectors.toList());
	}
	@Override
	public boolean removeById(int itemId)
	{
		if(map.containsKey(itemId))
		{
			map.remove(itemId);
			return true;
		}
		return false;
	}

	@Override
	public Book update(Book book)
	{
		if(map.containsKey(book.getItemId()))
		{
			map.put(book.getItemId(), book);
			return book;
		}
		return null;
	}

	@Override
	public Book add(Book book)
	{
		if(!map.containsKey(book.getItemId()))
		{
			map.put(book.getItemId(), book);
			return book;
		}
		return null;
	}

}
