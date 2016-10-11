package org.sugathan.shared;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface CustomerServicer {

	@RequestMapping(value="/customer/{id}", method=RequestMethod.GET, produces = "application/json")
	Customer getCustomer(@PathVariable int id);
	
}
