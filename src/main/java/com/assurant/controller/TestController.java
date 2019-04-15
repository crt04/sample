package com.assurant.controller;

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

import com.assurant.entity.loan;
import com.assurant.services.TestTableService;



@RestController
@RequestMapping("assurantTest")
public class TestController {
	
	@Autowired
	TestTableService testTableService;	
	
	//utilizes query param on url
	@GetMapping("/returnString")
	public String returnAString(@RequestParam("testString") String urlString){
		return urlString;
	}
	
	//utilizes path variable in url
	@GetMapping("/findInfo/{id}")
	public loan getInfo(@PathVariable("id") Integer id) throws Exception {
		return testTableService.findInfo(id);
	}
	
	@GetMapping(value = "/findAllInfo")
	public Iterable<loan> getAllInfo() {
		return testTableService.findAllInfo();
	}
	
	
	@PostMapping(value = "/saveInfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public loan getInfo(@RequestBody loan testTable) throws Exception {
		return testTableService.saveInfo(testTable);
	}
	
	@DeleteMapping(value = "/deleteInfo/{id}")
	public void removeInfo(@PathVariable("id") int idToBeRmoved) {
		testTableService.removeInfo(idToBeRmoved);
	}

}
