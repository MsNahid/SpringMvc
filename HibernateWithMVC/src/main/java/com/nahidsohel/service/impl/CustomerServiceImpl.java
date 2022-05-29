package com.nahidsohel.service.impl;

import com.nahidsohel.dao.CustomerDao;
import com.nahidsohel.entity.Customer;
import com.nahidsohel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public List<Customer> getCustomers() {

        return customerDao.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {

        customerDao.saveCustomer(theCustomer);
    }
}
