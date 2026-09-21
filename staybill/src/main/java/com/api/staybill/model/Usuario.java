package com.api.staybill.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usu;
    
    private String nom_usu;
    
    @Column(unique = true, nullable = false)
    private String correo_usu;
    
    private String pass_usu;
    private String rol_usu = "USER";
    private Boolean estado_usu = true;

    // Getters y Setters
    public Long getId_usu() { return id_usu; }
    public void setId_usu(Long id_usu) { this.id_usu = id_usu; }

    public String getNom_usu() { return nom_usu; }
    public void setNom_usu(String nom_usu) { this.nom_usu = nom_usu; }

    public String getCorreo_usu() { return correo_usu; }
    public void setCorreo_usu(String correo_usu) { this.correo_usu = correo_usu; }

    public String getPass_usu() { return pass_usu; }
    public void setPass_usu(String pass_usu) { this.pass_usu = pass_usu; }

    public String getRol_usu() { return rol_usu; }
    public void setRol_usu(String rol_usu) { this.rol_usu = rol_usu; }

    public Boolean getEstado_usu() { return estado_usu; }
    public void setEstado_usu(Boolean estado_usu) { this.estado_usu = estado_usu; }
}