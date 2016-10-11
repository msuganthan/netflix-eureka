package org.sugathan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.sugathan.client.CustomerServiceRestTemplateClient;

@RestController
public class CustomerRestTemplateController {

    private static Logger logger = LoggerFactory.getLogger(CustomerRestTemplateController.class);

    @Autowired
    private CustomerServiceRestTemplateClient customerServiceRestTemplateClient;
	
    @RequestMapping(value = "/customer-client/{id}", method = RequestMethod.GET, produces = "application/json")
    public MessageWrapper getCustomer(@PathVariable int id) {
        logger.debug("Reading customer using rest template client with ID " + id);
        return customerServiceRestTemplateClient.getCustomer(id);
    }
    
}
