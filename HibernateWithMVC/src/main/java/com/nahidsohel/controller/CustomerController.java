package com.nahidsohel.controller;

import com.nahidsohel.dao.CustomerDao;
import com.nahidsohel.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;
    @RequestMapping("/list")
    public String listOfCustomers(Model theModel){

        List<Customer> customerList = customerDao.getCustomers();

        theModel.addAttribute("customerList", customerList);

        return "list-customers";
    }
}
