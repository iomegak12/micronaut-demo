package com.intsol.service;

import java.util.List;
import com.intsol.model.Customer;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
