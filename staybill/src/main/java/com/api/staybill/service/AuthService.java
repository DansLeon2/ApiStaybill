package com.api.staybill.service;

import com.api.staybill.model.Usuario;
import com.api.staybill.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        
        return usuarioRepository.save(usuario);
    }
}