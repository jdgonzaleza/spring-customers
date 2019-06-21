package com.gorygon.cutomerservice.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gorygon.rentcloud.commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
