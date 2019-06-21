package com.kelwin.security.springsecurityauthserver.controller;


import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gorygon.cutomerservice.customerservice.service.CustomerService;
import com.gorygon.rentcloud.commons.model.Customer;
import com.kelwin.security.springsecurityauthserver.model.Item;

@RestController
@RequestMapping("/api/secure")
public class HelloResource {
	
	@Autowired
	CustomerService customerService;


    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
    @GetMapping("/hello")
    public Item hello() {
        Item item = new Item();
        item.setName("Hello world");
        item.setVersion("v1");

        return item;
    }
    
    @GetMapping("/profile")
    public List<Customer> getAllCustomers() {
    	return customerService.getAll();
    }



}
