package com.sheegra.app.module1.dao;

import java.io.Serializable;

import org.hibernate.Session;

public interface GenericDao <T, PK extends Serializable> {

  PK create(T object);
  
  T read(PK primaryKey);
  
  void update(T object);
  
  void delete(T object);
  
  Session getSession();
}
