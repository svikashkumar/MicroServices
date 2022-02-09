package com.vikash.Customer.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikash.Customer.DTO.CustomerDTO;
import com.vikash.Customer.Entity.Customer;
import com.vikash.Customer.Repository.CustomerRepository;

@Service
public class CustomerService {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CustomerRepository custRepo;
	
	public void createCustomer(CustomerDTO custDTO) {
		logger.info("Creation request for customer {}", custDTO);
		Customer cust=custDTO.createEntity();
		custRepo.save(cust);
		
	}
	
	public CustomerDTO getCustomerDetails(Long phoneNo) {
		logger.info("Request for customer Details", phoneNo);
		Customer cust = custRepo.getById(phoneNo);
		CustomerDTO custDTO = CustomerDTO.valueOf(cust);
		return custDTO;
	}

}
