package com.nitesh.dao.impl;

import org.springframework.stereotype.Repository;

import com.nitesh.dao.AbstractDao;
import com.nitesh.dao.CustomerDao;
import com.nitesh.entity.Customer;

@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDao<Customer> implements CustomerDao {

}
