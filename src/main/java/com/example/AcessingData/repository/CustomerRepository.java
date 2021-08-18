package com.example.AcessingData.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.AcessingData.entity.CustomerEntity;
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}