package by.htp.simple.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.simple.bean.Book;

public class BookLogic {
	public List<Book> findByAuthor(List<Book> books, String author){
		List<Book> newBooks = new ArrayList<Book>();
		for(Book book : books) {
			if (book.getAuthor().equals(author)) {
				newBooks.add(book);
			}
		}
		return newBooks;
		
	}

	public List<Book> findByPublishingHouse(List<Book> books, String publishingHouse){
		List<Book> newBooks = new ArrayList<Book>();
			for(Book book : books) {
				if (book.getPublishingHouse().equals(publishingHouse)) {
					newBooks.add(book);
				}
			}
			return newBooks;
			
		}
	
	public List<Book> findByYearPublishing(List<Book> books, int yearPublishing){
		List<Book> newBooks = new ArrayList<Book>();
			for(Book book : books) {
				if (book.getYearPublishing() > yearPublishing) {
					newBooks.add(book);
				}
			}
			return newBooks;
			
		}

}
