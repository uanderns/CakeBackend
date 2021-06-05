package com.cakedeliver.cakedeliver.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cakedeliver.cakedeliver.entities.Sabor;
import com.cakedeliver.cakedeliver.repository.SaborRepository;

@Service
public class SaborService {
	
	@Autowired
	private SaborRepository repository;
	
	public List<Sabor> listAll(){
		return repository.findAll();
	}	
	
	public void save(Sabor sabor) {
		repository.save(sabor);
	}
	
	public Sabor get(Long id) {
		return repository.findById(id).get();
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
