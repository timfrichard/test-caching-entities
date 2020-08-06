package com.myorganization.sprocket.services;

import com.google.common.collect.Lists;
import com.myorganization.sprocket.models.entities.Customer;
import com.myorganization.sprocket.repositories.CustomerRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(final CustomerRepository repository) {
        this.repository = repository;
    }

    /**
     * Delete a customer.
     *
     * @param customer
     */
    public void delete(final Customer customer) {
        repository.delete(customer);
    }

    /**
     * Find All Customers.
     *
     * @return
     */
    public List<Customer> findAll() {

        final Sort sort = Sort.by(Sort.Direction.ASC, "company", "lastName", "firstName");
        return Lists.newArrayList(repository.findAll(sort));
    }

    /**
     * Find a customer by the id field.
     *
     * @param customerId
     * @return Customer
     */
    public Customer findById(final Long customerId) {
        return repository.findById(customerId).orElse(null);
    }

    /**
     * Save a customer.
     *
     * @param customer
     * @return Customer
     */
    public Customer save(final Customer customer) {
        return repository.save(customer);
    }
}
