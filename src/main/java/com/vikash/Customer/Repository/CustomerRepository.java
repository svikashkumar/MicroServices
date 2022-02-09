package com.vikash.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikash.Customer.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
