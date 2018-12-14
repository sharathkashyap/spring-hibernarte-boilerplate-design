package com.sheegra.app.module1.dao;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sheegra.app.module1.pojo.Customer;

@Repository
public interface CustomerDao extends GenericDao<Customer, Serializable>{

}
