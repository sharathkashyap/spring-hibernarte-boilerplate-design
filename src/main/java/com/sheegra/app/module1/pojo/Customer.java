package com.sheegra.app.module1.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tx_customer")
public class Customer {
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int customerId;
  
  private String email;
  
  private String firstName;
  
  private String lastName;
  
  

  public Customer(int customerId, String email, String firstName, String lastName) {
    super();
    this.customerId = customerId;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  

}
