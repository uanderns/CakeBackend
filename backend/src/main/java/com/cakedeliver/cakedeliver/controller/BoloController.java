package com.cakedeliver.cakedeliver.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cakedeliver.cakedeliver.entities.Bolo;
import com.cakedeliver.cakedeliver.repository.BoloRepository;
import com.cakedeliver.cakedeliver.service.BoloService;


@RestController
@ResponseBody
@RequestMapping("api/v1")
@CrossOrigin(origins="*")
public class BoloController {

	@Autowired
	private BoloService service;
	
	@Autowired
	private BoloRepository repository;

	//@GetMapping("/bolos")
	//public List<Bolo> list() {
	//	return service.listAll();

	//}
	
	@GetMapping("/bolos")
	public ResponseEntity<List<Bolo>> findAll(){
		List<Bolo> result = repository.findAll();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/bolos/page") //Paginação
	public ResponseEntity<Page<Bolo>> findAll(Pageable pageable){
		Page<Bolo> result = repository.findAll(pageable);
		return ResponseEntity.ok(result);
	}
	
	

	@GetMapping("/bolos/{id}")
	public ResponseEntity<Bolo> get(@PathVariable Long id) {
		try {
			Bolo bolo = service.get(id);
			return new ResponseEntity<Bolo>(bolo, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Bolo>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/bolos")
	public void add(@RequestBody Bolo bolo) {
		repository.save(bolo);
		//service.save(bolo);
		System.out.println("gravado com sucesso!");

	}

	@PutMapping("/bolos/{id}")
	public ResponseEntity<?> update(@RequestBody Bolo bolo, @PathVariable Long id) {
		try {
			Bolo existBolo = service.get(id);
			service.save(bolo);

			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/bolos/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
		//service.delete(id);
	}

}
