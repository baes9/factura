package com.sistema.factura.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

import com.sistema.factura.Repositories.ClienteRepository;
import com.sistema.factura.Entities.Cliente;

@Service
@NoArgsConstructor
public class ClienteService {
    private ClienteRepository clienteRepository;

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public List<Cliente> allClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Optional<Cliente> buscarClientePorCedula(String cedula) {
        return clienteRepository.buscarPorCedula(cedula);
    }
}
