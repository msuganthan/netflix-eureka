package org.sugathan.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.sugathan.controller.MessageWrapper;
import org.sugathan.shared.Customer;

@Component
public class CustomerServiceRestTemplateClient {

	@Autowired
	private RestTemplate restTemplate;
	
	public MessageWrapper<Customer> getCustomer(int id) {
		Customer customer = restTemplate.exchange(
				"http://customer-service/customer/{id}", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<Customer>() {
				},
				id).getBody();
		
		return new MessageWrapper<>(customer, "server called using eureka with rest template");
	}
	
}
