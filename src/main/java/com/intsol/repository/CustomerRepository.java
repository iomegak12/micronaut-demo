package com.intsol.repository;

import com.intsol.model.Customer;
import io.micronaut.data.annotation.Repository;

@Repository
public interface CustomerRepository
        extends io.micronaut.data.repository.CrudRepository<Customer, Long> {

}
