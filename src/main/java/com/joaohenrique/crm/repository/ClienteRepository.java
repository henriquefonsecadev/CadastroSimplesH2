package com.joaohenrique.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaohenrique.crm.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
