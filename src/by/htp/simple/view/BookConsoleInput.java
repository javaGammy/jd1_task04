package by.htp.simple.view;

import java.util.ArrayList;
import java.util.List;

import by.htp.simple.bean.Book;

public class BookConsoleInput {
	public List<Book> create() {
		List<Book> Books = new ArrayList<Book>();
		
		Book bk = new Book(123, "ASDFsf", "Иванов", "Иванович",  123, 115, 213, "asfsdf");
		Books.add(bk);
		
		bk = new Book(123, "ASDFsf", "Иванов", "Иванович",  123, 115, 213, "asfsdf");
		Books.add(bk);

		bk = new Book(123, "ASDFsf", "Иванов", "Иванович",  123, 115, 213, "asfsdf");
		Books.add(bk);
		
		bk = new Book(123, "ASDFsf", "Иванов", "Иванович",  123, 115, 213, "asfsdf");
		Books.add(bk);
		
		bk = new Book(123, "ASDFsf", "Иванов", "Иванович",  123, 115, 213, "asfsdf");
		Books.add(bk);
		
		
		return Books;

}
}
