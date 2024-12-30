package com.intsol.service;

import java.util.List;

import com.intsol.model.Customer;
import com.intsol.repository.CustomerRepository;

import jakarta.inject.Singleton;

@Singleton
public class CustomerServiceImpl
        implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findById(
                customer.getId()).orElse(null);

        if (existingCustomer != null) {
            existingCustomer.setName(customer.getName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setAge(customer.getAge());
            existingCustomer.setCreatedDate(customer.getCreatedDate());
            existingCustomer.setSummary(customer.getSummary());

            return customerRepository.update(existingCustomer);
        }

        return null;
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
