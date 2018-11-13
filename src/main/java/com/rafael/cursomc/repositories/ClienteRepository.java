package com.rafael.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.cursomc.domain.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Integer>{

	
}
