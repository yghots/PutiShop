package org.example.putishop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USUARIOS")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_USUARIO", unique = true, nullable = false)
    private String codigoUsuario;

    private String username;
    private String name;
    private String foto;
    private String password;
    private String rol;

    @Column(nullable = false)
    private boolean estado;
}