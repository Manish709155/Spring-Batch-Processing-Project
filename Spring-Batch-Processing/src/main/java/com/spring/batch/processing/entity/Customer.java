package com.spring.batch.processing.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "customer_id")
    String customerId;

    @Column(name = "name")
    String name;

    @Column(name = "segment")
    String segment;

    @Column(name = "state")
    String state;

    @Column(name = "city")
    String city;
}