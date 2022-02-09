package com.vikash.Customer.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.Customer.DTO.CustomerDTO;
import com.vikash.Customer.Services.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CustomerService CustService;
	
	
	@RequestMapping(value = "/customers", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createCustomer(@RequestBody CustomerDTO custDTO) {
		CustService.createCustomer(custDTO);
	}
	
	@RequestMapping(value="/customers/{phoneNo}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerDTO getCustomerDetails(@PathVariable Long phoneNo) {
		logger.info("Profile request for customer {}", phoneNo);
		return CustService.getCustomerDetails(phoneNo);
	}

}
