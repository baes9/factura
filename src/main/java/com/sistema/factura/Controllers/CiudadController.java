package com.sistema.factura.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.factura.Entities.Ciudad;
import com.sistema.factura.Services.CiudadService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/ciudad")
@RequiredArgsConstructor
public class CiudadController {
    private CiudadService ciudadService;
    
    @PostMapping
    public Ciudad guardarCiudad(@RequestBody Ciudad ciudad){
        return ciudadService.guardarCiudad(ciudad);
    }

    @GetMapping
    public List<Ciudad> allCiudades(){
        return ciudadService.allCiudades();
    }

    @DeleteMapping("/{id}")
    public void eliminarCiudad(@PathVariable Long id){
        ciudadService.eliminarCiudad(id);
    }

    @GetMapping("/{id}")
    public Optional<Ciudad> getCiudad(@PathVariable Long id){
        return ciudadService.buscarCiudadPorId(id);
    }

    @PutMapping("/{id}")
    public Ciudad actualizarCiudad(@PathVariable Long id, @RequestBody Ciudad ciudad){
        return ciudadService.guardarCiudad(ciudad);
    }
    
}
