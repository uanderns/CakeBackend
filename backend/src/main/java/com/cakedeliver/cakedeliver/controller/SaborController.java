package com.cakedeliver.cakedeliver.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakedeliver.cakedeliver.entities.Sabor;
import com.cakedeliver.cakedeliver.repository.SaborRepository;


@RestController
@RequestMapping(value = "/sabores")
@CrossOrigin(origins="*")
public class SaborController {
	
	@Autowired
	private SaborRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<Sabor>> findall(){ // buscar todos
		
		List<Sabor> result = repository.findAll();
		return ResponseEntity.ok(result);
		
	}
	
	
	

}
