package com.example.AcessingData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AcessingData.entity.CustomerEntity;
import com.example.AcessingData.repository.CustomerRepository;

@SpringBootApplication
public class AcessingDataApplication {

  public static void main(String[] args) {
    SpringApplication.run(AcessingDataApplication.class);
  }

  @Bean
  public CommandLineRunner demo(CustomerRepository repository) {
    return (args) -> {
      // save a few customers
      repository.save(new CustomerEntity("Jack", "Bauer"));
      repository.save(new CustomerEntity("Chloe", "O'Brian"));
      repository.save(new CustomerEntity("Kim", "Bauer"));
      repository.save(new CustomerEntity("David", "Palmer"));
      repository.save(new CustomerEntity("Michelle", "Dessler"));
    };
  }

}