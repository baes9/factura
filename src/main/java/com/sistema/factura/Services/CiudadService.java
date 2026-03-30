package com.sistema.factura.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

import com.sistema.factura.Repositories.CiudadRepository;
import com.sistema.factura.Entities.Ciudad;

@Service
@NoArgsConstructor
public class CiudadService {
    private CiudadRepository ciudadRepository;

    public Ciudad guardarCiudad(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    public void eliminarCiudad(Long id) {
        ciudadRepository.deleteById(id);
    }

    public List<Ciudad> allCiudades() {
        return ciudadRepository.findAll();
    }

    public Optional<Ciudad> buscarCiudadPorId(Long id) {
        return ciudadRepository.findById(id);
    }
}
