package com.spring.batch.processing.config;

import com.spring.batch.processing.entity.Customer;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public @Nullable Customer process(@NonNull Customer customer) throws Exception {
        return customer;
    }

    // for applying filter which  city ,name etc want to import
//    @Override
//    public @Nullable Customer process(@NonNull Customer customer) throws Exception {
//        if (customer.getCity().equals("Houston")){
//
//            return  customer;
//        }
//        else {
//            return  null;
//        }
//    }
}
