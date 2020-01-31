package com.assurant.controller;

import java.io.File;
import java.io.FileFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assurant.entity.Customer;
import com.assurant.services.CustomerService;

@RestController
@RequestMapping("assurantTest/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;	
	
		
	//utilizes query param on url
	@GetMapping("/returnString")
	public String returnAString(@RequestParam("testString") String urlString){
		return urlString;
	}
	

	
	
	//utilizes path variable in url
	@GetMapping("/findInfo/{id}")
	public Customer getInfo(@PathVariable("id") Integer id) throws Exception {
		return customerService.findInfo(id);
	}
	
	@GetMapping(value = "/findAllInfo")
	public Iterable<Customer> getAllInfo() {
		return customerService.findAllInfo();
	}
	
	
	@PostMapping(value = "/saveInfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer getInfo(@RequestBody Customer customer) throws Exception {
		return customerService.saveInfo(customer);
	}
	
	@DeleteMapping(value = "/deleteInfo/{id}")
	public void removeInfo(@PathVariable("id") int idToBeRmoved) {
		customerService.removeInfo(idToBeRmoved);
	}

}

