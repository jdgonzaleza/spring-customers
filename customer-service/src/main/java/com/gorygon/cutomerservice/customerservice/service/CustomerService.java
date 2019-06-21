package com.gorygon.cutomerservice.customerservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.gorygon.rentcloud.commons.model.Customer;

public interface CustomerService {
	public Customer save(Customer customer); 
	public List<Customer> getAll();
	public Customer getById(int id);
	public Customer upate(int id, Customer customer);
	public ResponseEntity<?> delete(int id);
}
