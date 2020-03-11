package by.htp.simple.view;

import java.util.ArrayList;
import java.util.List;

import by.htp.simple.bean.Customer;

public class CustomerConsoleInput {
	public List<Customer> create() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer cr = new Customer(123, "Иван", "Иванов", "Иванович", "Пушкино, 24", 123, 115);
		customers.add(cr);
		
		cr = new Customer(123, "Петр", "Петров", "Петрович", "Лермонтов, 22", 321, 130);
		customers.add(cr);

		cr = new Customer(123, "Алексеев", "Иванов", "Иванович", "Пушкино, 24", 321, 456);
		customers.add(cr);
		
		cr = new Customer(123, "Иван", "Алексей", "Иванович", "Пушкино, 24", 321, 456);
		customers.add(cr);
		
		cr = new Customer(123, "Иван", "Алексей", "Аремович", "Пушкино, 24", 321, 456);
		customers.add(cr);
		
		
		return customers;
		
}
}
