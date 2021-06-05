package com.cakedeliver.cakedeliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cakedeliver.cakedeliver.entities.Bolo;

@Repository
public interface BoloRepository extends JpaRepository<Bolo, Long> {

}
