package com.api.staybill.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.staybill.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    
    @Query("SELECT u FROM Usuario u WHERE u.correo_usu = ?1")
    Optional<Usuario> buscarPorCorreo(String correo);
}