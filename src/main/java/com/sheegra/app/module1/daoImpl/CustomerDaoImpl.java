package com.sheegra.app.module1.daoImpl;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sheegra.app.module1.dao.CustomerDao;
import com.sheegra.app.module1.pojo.Customer;

@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer, Serializable> implements CustomerDao{

  public CustomerDaoImpl() {
    super(Customer.class);
    // TODO Auto-generated constructor stub
  }

}
