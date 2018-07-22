package com.ssh.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notebook.entity.user;
import com.ssh.repository.DomainRepository;
import com.ssh.repository.userRepository;

import java.io.Serializable;
import java.util.List;

/**
 * @param <T>
 */
@Repository
public class userImpl<T> implements userRepository {
	
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

	@Override
	public user load(Serializable id) {
		return (user) getCurrentSession().load(user.class, id);
	}

	@Override
	public user get(Serializable id) {
		   return (user)getCurrentSession().get(user.class,id);

	}

	@Override
	public List<user> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void persist(user entity) {
		// TODO Auto-generated method stub
		 getCurrentSession().persist(entity);
	}

	@Override
	public Serializable save(user entity) {
		  return (Long)getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(user entity) {
		 getCurrentSession().saveOrUpdate(entity);
		
		
	}

	@Override
	public void delete(Serializable id) {
		  user user = load(id);
	        getCurrentSession().delete(user);
		
	}

	@Override
	public void flush() {
		 getCurrentSession().flush();		
	}

	@Override
	public long savaUser() {
		// TODO Auto-generated method stub
		return 0;
	}

  
}