package com.sheegra.app.module1.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sheegra.app.module1.dao.CustomerDao;
import com.sheegra.app.module1.pojo.Customer;
import com.sheegra.app.module1.service.CustomerService;

@Component
public class CustomerServiceImpl implements CustomerService{
  
  @Autowired
  private CustomerDao customerDao;

  @Override
  @Transactional
  public boolean login(Customer customer) {
    // TODO Auto-generated method stub
    if(customerDao.read(customer.getCustomerId())!=null) {
      
    } else {
      return customerDao.create(customer)!=null;
    }
    return false;
  }

  @Override
  @Transactional
  public Customer fetchCustomer(String id) {
    // TODO Auto-generated method stub
    return customerDao.read(id);
  }

}
