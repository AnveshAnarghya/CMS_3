package com.ac.rg.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ac.rg.entity.TestEntity;
import com.ac.rg.service.TestServie;

@RestController
@RequestMapping
public class TestController {
	@Autowired
	private TestServie testService;
	@PostMapping("/create")
	public ResponseEntity<TestEntity>  saveData(@RequestBody TestEntity dto) {
		
		return new  ResponseEntity<>(testService.saveData(dto),HttpStatus.CREATED);
		
		
	
	}

	@PutMapping("/anvesh/{id}")
	public ResponseEntity<TestEntity>   updateData(@PathVariable Long id,@RequestBody TestEntity update) {
		return new 	ResponseEntity<>(testService.updateData(id,update),HttpStatus.OK);
	
	} 
	@GetMapping("/get")
	public ResponseEntity<List<?>>  getData() {
		
        return new 	ResponseEntity<List<?>>( testService.getData(),HttpStatus.OK);
	
	}  
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>  deleteData(@PathVariable Long id) {
		
        return new 	ResponseEntity<>( testService.deleteData(id),HttpStatus.OK);
	
	}

}
