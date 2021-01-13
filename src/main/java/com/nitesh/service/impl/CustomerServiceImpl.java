package com.nitesh.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitesh.dao.CustomerDao;
import com.nitesh.entity.Customer;
import com.nitesh.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	public Customer registerCustomer(Customer customerForm) {
		Customer customer = customerDao.saveDetail(customerForm);
		return customer;
	}


}
