package com.sheegra.app.module1.service;

import org.springframework.stereotype.Component;

import com.sheegra.app.module1.pojo.Customer;

@Component
public interface CustomerService {
  
  boolean login(Customer customer);
  
  Customer fetchCustomer(String id);
  
}
