package com.spring.batch.processing.config;

import com.spring.batch.processing.entity.Customer;
import com.spring.batch.processing.repository.CustomerRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class CustomerWriter implements ItemWriter<Customer> {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void write(@NonNull List<? extends Customer> customers) throws Exception {
        System.out.println("Thread Name : -"+Thread.currentThread().getName());
        customerRepository.saveAll(customers);
    }
}
