package by.htp.simple.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.simple.bean.Customer;

public class CustomerLogic {	
	public List<Customer> findByCardNumber(List<Customer> customers, int firstRange, int secondRange){
		List<Customer> newCustomers = new ArrayList<Customer>();
		for(Customer fr : customers) {
			if(fr.getCreditCardNumber() >= firstRange && fr.getCreditCardNumber() <= secondRange) {
				newCustomers.add(fr);
			}
		}
		return newCustomers;
	}

}
