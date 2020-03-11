package by.htp.simple.view;

import java.util.List;

import by.htp.simple.bean.Customer;

public class CustomerView {
	public void print(Customer customer) {
		System.out.println(" name: " + customer.getName() + " surname: " + customer.getSurname() + " patronymic: " + customer.getPatronymic());
	}
	public void print(List<Customer> customers) {
		for (Customer cr : customers) {
			print(cr);
		}
	}

}
