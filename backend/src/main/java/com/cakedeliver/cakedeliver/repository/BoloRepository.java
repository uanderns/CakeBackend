package com.cakedeliver.cakedeliver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.cakedeliver.cakedeliver.entities.Bolo;

@Repository
@EnableJpaRepositories
public interface BoloRepository extends JpaRepository<Bolo, Long> {
	
	// Query para ordenar por nome ordem crescente
	List<Bolo> findAllByOrderByNomeAsc(); 
	
	//@Query("SELECT obj FROM Bolo obj JOIN FETCH obj.sabores")
	//List<Bolo> findBoloAll(List<Bolo> bolos);
	

}
