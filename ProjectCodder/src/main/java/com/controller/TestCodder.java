package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CodderRepository;
import com.model.Codder;
import com.service.CodderService;

@RestController
public class TestCodder {
	
	@Autowired
	CodderService codderService;
	
	@PostMapping("/addcodder" )
	public Codder addCodder(@RequestBody Codder c) {
		return codderService.addCodder(c);
		 
	}
	
	@GetMapping("/getOne/{id}")
	public Codder getCodder(@PathVariable int id) {
		return codderService.getCodderById(id);	
	}
	
	@PutMapping("/update")
	public Codder updateCodder(@RequestBody Codder c) {
		return codderService.updateCodderById(c);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCodder(@PathVariable ("id") int id) {
		
		return codderService.deleteCodder(id);
		
		
	}
}
