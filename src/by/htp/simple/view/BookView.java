package by.htp.simple.view;

import java.util.List;

import by.htp.simple.bean.Book;

public class BookView {	
		public void print(Book book) {
			System.out.println(" title: " + book.getTitle());
		}
		public void print(List<Book> books) {
			for (Book cr : books) {
				print(cr);
			}
		}

	}


