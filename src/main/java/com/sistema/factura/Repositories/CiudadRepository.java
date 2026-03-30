package com.sistema.factura.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.factura.Entities.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
    
}
