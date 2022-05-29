package com.nahidsohel.controller;

import com.nahidsohel.entity.Customer;
import com.nahidsohel.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/list")
    public String listOfCustomers(Model theModel){

        List<Customer> customerList = customerService.getCustomers();

        theModel.addAttribute("customerList", customerList);

        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Customer theCustomer = new Customer();

        theModel.addAttribute("customer", theCustomer);

        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {

        // save the customer using our service
        customerService.saveCustomer(theCustomer);


        return "redirect:/customers/list";
    }
}