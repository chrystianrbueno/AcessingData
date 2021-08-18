package com.example.AcessingData.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerRestControllerDeleteAll {
	@Autowired
	MockMvc mvc;
	
	@Test
	public void shouldDeleteAllCustomers() throws Exception {
		mvc.perform(delete("/api/customers/"))
		.andExpect(status().isOk())
		.andExpect(content().string(""));
	}
}
