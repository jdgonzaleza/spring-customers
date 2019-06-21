package com.gorygon.cutomerservice.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gorygon.cutomerservice.customerservice.exception.ResourceNotFoundException;
import com.gorygon.cutomerservice.customerservice.repository.CustomerRepository;
import com.gorygon.rentcloud.commons.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getById(int id) {
		return customerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id));
	}

	@Override
	public Customer upate(int id, Customer customer) {
		Customer searchedCustomer = customerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id));
		searchedCustomer.setFirstName(customer.getFirstName());
		searchedCustomer.setLastName(customer.getLastName());
		searchedCustomer.setZipCode(customer.getZipCode());
		Customer updatedCustomer = customerRepository.save(searchedCustomer);
		return updatedCustomer;
	}

	@Override
	public ResponseEntity<Object> delete(int id) {
		// TODO Auto-generated method stub
		Customer searchedCustomer = customerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id));
		customerRepository.delete(searchedCustomer);
		return ResponseEntity.ok().build();
	}

}
