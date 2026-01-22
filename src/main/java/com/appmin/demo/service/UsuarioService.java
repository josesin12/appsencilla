package com.appmin.demo.service;

import com.appmin.demo.model.Usuario;
import com.appmin.demo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    // Inyección por constructor (forma profesional)
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Lógica de negocio
    public Usuario crearUsuario(String nombre) {
        Usuario usuario = new Usuario(nombre);
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }
}
