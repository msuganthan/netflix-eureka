package org.sugathan.rest;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.sugathan.shared.Customer;
import org.sugathan.shared.CustomerServicer;

@RestController
public class CustomerController implements CustomerServicer{

	private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	private List<Customer> customers;
	
	public CustomerController() {
		customers = new LinkedList<>();
		customers.add(new Customer(1, "Gokul", "Mohan"));
		customers.add(new Customer(1, "Sandeep", "Sunil"));
	}
	
	@Override
	public Customer getCustomer(@PathVariable int id) {
		logger.debug("reading customer with id "+id);
		
		Optional<Customer> customer = customers.stream().filter(customer1 -> customer1.getId() == id).findFirst();
		
		return customer.get();
		
	}
	
}
