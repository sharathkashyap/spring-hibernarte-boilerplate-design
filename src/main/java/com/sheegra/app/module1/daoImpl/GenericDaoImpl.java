package com.sheegra.app.module1.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sheegra.app.module1.dao.GenericDao;

/**
 * Generic Implementation of Dao Layer to be class independent.
 * Parameterized Dao to be extended by each of the Dao Classes which intends to implement persistence layer.
 * SessionFactory Object declared as part of context file to be auto wired. Used mostly to get session Object.
 * 
 * Note: Transaction Management: @Transactional to be used as part of pojo based Dao Impl. Please do not introduce
 * this at this layer. 
 * @author shprasad
 *
 * @param <T> - Class to be Parameterized
 * @param <PK> - primary key
 */
public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T,PK> {
  
  private Class<T> classz;
  
  public GenericDaoImpl(Class<T> classz) {
    super();
    this.classz = classz;
  }

  @Autowired
  SessionFactory sessionFactory;

  @Override
  public PK create(T object) {
    // TODO Auto-generated method stub
    return (PK) getSession().save(object);
  }

  @Override
  public T read(PK primaryKey) {
    // TODO Auto-generated method stub
    return (T) getSession().get(classz, primaryKey);
  }

  @Override
  public void update(T object) {
    // TODO Auto-generated method stub
    getSession().update(object);
  }

  @Override
  public void delete(T object) {
    // TODO Auto-generated method stub
    getSession().delete(object);
    
  }

  @Override
  public Session getSession() {
    // TODO Auto-generated method stub
    return sessionFactory.getCurrentSession();
  }
  
}
