package com.book;

public class Library {
	private Book book;

	public Library(Book book) {
		super();
		this.book = book;
	}
	
	public void showBook() {
		System.out.println("Book Title :: "+book.getTitle());
	}
}
