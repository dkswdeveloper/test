package com.fil.lib.model;

public class Book extends Item
{
	private int bookId;
	private String title;
	private String author;
	private String publisher;
	public Book()
	{
		super(); //will need in JPA
	}
	
	public Book(int bookId, String title, String author, String publisher)
	{
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public int getBookId()
	{
		return bookId;
	}
	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}

	@Override
	public String toString()
	{
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author
				+ ", publisher=" + publisher + ", getItemId()=" + getItemId() + "]";
	}
}
