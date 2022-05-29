package com.nahidsohel.dao.impl;

import com.nahidsohel.dao.CustomerDao;
import com.nahidsohel.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    // need to injects sessionfactory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();

        List  customerList = session.createQuery("From Customer c", Customer.class).list();

        return customerList;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {

        Session currentSession = sessionFactory.getCurrentSession();

        currentSession.save(theCustomer);

    }
}
