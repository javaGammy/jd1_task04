package by.htp.simple.view;

import java.util.ArrayList;
import java.util.List;

import by.htp.simple.bean.Customer;

public class CustomerConsoleInput {
	public List<Customer> create() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer cr = new Customer(123, "����", "������", "��������", "�������, 24", 123, 115);
		customers.add(cr);
		
		cr = new Customer(123, "����", "������", "��������", "���������, 22", 321, 130);
		customers.add(cr);

		cr = new Customer(123, "��������", "������", "��������", "�������, 24", 321, 456);
		customers.add(cr);
		
		cr = new Customer(123, "����", "�������", "��������", "�������, 24", 321, 456);
		customers.add(cr);
		
		cr = new Customer(123, "����", "�������", "��������", "�������, 24", 321, 456);
		customers.add(cr);
		
		
		return customers;
		
}
}
