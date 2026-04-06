package com.sistema.factura.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.factura.Entities.Usuario;
import com.sistema.factura.Repositories.UsuarioRepository;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class UsuarioService {
    @Autowired 
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void deleteUsuario(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario != null) {
            usuarioRepository.deleteById(id);
        }
    }

    public Usuario findUsuarioByUsername(String username) {
        return usuarioRepository.findByUsername(username).orElse(null);
    }
}
