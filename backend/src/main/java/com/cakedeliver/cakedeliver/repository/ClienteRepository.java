package com.cakedeliver.cakedeliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cakedeliver.cakedeliver.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
}
